import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");

    int inputNumber = scanner.nextInt();

    //for (int multiplier = 1; multiplier <= 10; multiplier++) {
    //  System.out.println(multiplier + " * " + inputNumber + " = " + (multiplier * inputNumber));
    //}

    int multiplier = 1;

    while (multiplier <= 10) {
      System.out.println(multiplier + " * " + inputNumber + " = " + (multiplier * inputNumber));
      multiplier++;
    }

  }
}
