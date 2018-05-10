import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the number of boys: ");
    int inputBoys = scanner.nextInt();

    System.out.println("Please enter the number of girls: ");
    int inputGirls = scanner.nextInt();

    if (inputGirls == 0) {
      System.out.println("Sausage party");
    } else if ((inputBoys + inputGirls) < 20) {
      System.out.println("Average party...");
    } else if (inputBoys != inputGirls && (inputBoys + inputGirls) > 20) {
      System.out.println("Quite cool party!");
    } else if (inputBoys == inputGirls && (inputBoys + inputGirls) > 20) {
      System.out.println("The party is excellent!");
    }
  }
}