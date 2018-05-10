import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many chicken the farmer has:");
        int userInt1 = scanner.nextInt();

        System.out.println("Please enter how many pigs the farmer has:");
        int userInt2 = scanner.nextInt();

        System.out.println("The animals have all in all this amount of legs: " + ((userInt1 * 2) + (userInt2 * 4)));
    }
}
