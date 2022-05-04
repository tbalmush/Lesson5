import java.util.Scanner;

public class ClassExercise3 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Write a double number:");
    double x = scan.nextDouble();

    double result = (x * x * x) + (x * x) + x + 1;
    System.out.println("The result is equal with = " + result);

    // Math.pow(x, 3);
    //System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1);


  }
}
