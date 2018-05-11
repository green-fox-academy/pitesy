import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");

    int userInput = scanner.nextInt();

    for (int outer = 1; outer <= userInput; outer++) {
      for (int inner1 = userInput - outer; inner1 >= 1; inner1--) {
      System.out.print("x");
      }
      for (int inner2 = 1; inner2 <= 7; inner2 +=2) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}