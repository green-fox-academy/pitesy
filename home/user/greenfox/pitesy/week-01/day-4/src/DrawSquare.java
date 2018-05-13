import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");

    int userInput = scanner.nextInt();

    for (int rowCount = 1; rowCount <= userInput; rowCount++) {
      if (rowCount == 1 || rowCount == userInput) {
        for (int xCount = 1; xCount <= userInput; xCount++) {
          System.out.print("%");
        }
        System.out.println(" ");
      } else {
        System.out.print("%");
        for (int emptySpace = 1; emptySpace <= userInput - 2; emptySpace ++) {
          System.out.print(" ");
        }
        System.out.print("%");
        System.out.println(" ");
      }
    }
  }
}
