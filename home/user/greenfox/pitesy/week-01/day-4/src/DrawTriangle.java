import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Please enter a number:");

    int userInput = scanner.nextInt();

    for (int outer = 1; outer <= userInput; outer++) {
      for (int inner = 1; inner <= outer; inner++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

