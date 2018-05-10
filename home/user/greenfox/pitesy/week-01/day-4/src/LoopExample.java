import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {

        //int hungerCounter = 0;
        Scanner userInput = new Scanner(System.in);
        int hungerCounter = userInput.nextInt();

        while (hungerCounter < 10) {
            System.out.println("[" + hungerCounter + "] Ehes vagyok");
            hungerCounter++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

        }
    }
}
