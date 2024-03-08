import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("The computer has chosen a number between 1 and 100.");

        int computerNumber = random.nextInt(100) + 1;
        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == computerNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userGuess < computerNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
}
