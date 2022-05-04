package com.company;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Print something...");
    String str = scanner.nextLine();
    System.out.println("Input was: " + str);

    System.out.println("Hello, Please wrote your name ... and age");
    String name = scanner.nextLine();
    int age = scanner.nextInt();
    System.out.println("Hi, my name is " + name + "\n" + "I'm " + age + " years old.");




  }

}
