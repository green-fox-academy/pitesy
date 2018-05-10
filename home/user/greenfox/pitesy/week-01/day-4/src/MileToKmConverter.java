import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance in kilometers:");

        int userInput = scanner.nextInt();

        System.out.println("The distance in miles is: " + (userInput * 1.6));
    }
}
