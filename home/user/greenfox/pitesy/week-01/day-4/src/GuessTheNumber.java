import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int secretNumber = 12;
      int userInput = 0;
      while (userInput != 12) {

      System.out.println("Guess a number:");
      userInput = scanner.nextInt();

      if (userInput == secretNumber) {
        System.out.println("You found the number: " + secretNumber);
      } else if (userInput < secretNumber) {
        System.out.println("The stored number is higher");
      } else if (userInput > secretNumber) {
        System.out.println("The stored number is lower");
      }
    }
  }
}
