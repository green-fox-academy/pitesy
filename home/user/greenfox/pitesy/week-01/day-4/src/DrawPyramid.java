import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");

    int userInput = scanner.nextInt();

    for (int rowCounter = 1; rowCounter <= userInput; rowCounter++) {
      for (int drawDot = userInput - rowCounter; drawDot > 0; drawDot--) {
        System.out.print(" ");
      }

      for (int drawStar = 1; (drawStar < rowCounter * 2) ; drawStar ++) {
        System.out.print("*");
      }
        System.out.println(" ");
    }
  }
}
