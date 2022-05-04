import java.util.Scanner;

public class ClassExercise2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("n value is equal with?");
    int n = scanner.nextInt();

    int result = ((n + 1) * n + 2 ) * n + 3;
    System.out.println("The result is " + result);

  }

}
