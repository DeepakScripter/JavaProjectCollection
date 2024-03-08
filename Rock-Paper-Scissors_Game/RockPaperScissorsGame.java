import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        while (true) {
            System.out.print("Enter your choice (rock, paper, scissors, or exit): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please enter rock, paper, scissors, or exit.");
                continue;
            }

            String computerChoice = generateComputerChoice(random);
            System.out.println("Computer's choice: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String generateComputerChoice(Random random) {
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return ""; // This should not happen
        }
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
