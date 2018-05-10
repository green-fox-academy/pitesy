import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please input a number:");
    int inputOne = scanner.nextInt();

    System.out.println("Please input another one:");
    int inputTwo = scanner.nextInt();

    if (inputOne > inputTwo) {
      System.out.println("The second number should be bigger");
    } else {
      for (int counter = inputOne; counter < inputTwo; counter++) {
        System.out.println(counter);
      }
    }

  }
}
