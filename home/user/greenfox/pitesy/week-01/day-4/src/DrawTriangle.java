import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("please enter a number");

    int userInput = scanner.nextInt();

    for (int rowCounter = 1; rowCounter <= userInput; rowCounter++) {
      for (int drawStar = 1; drawStar <= rowCounter; drawStar++) {
        System.out.print("* ");
      }
      for (int drawDot = userInput - rowCounter; drawDot >= 0; drawDot--) {
        System.out.print(". ");
      }
      System.out.println(" ");
    }
  }
}

