import java.util.Scanner;

public class CustomCalculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = getValidInput(scanner.nextLine());

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = getValidOperator(scanner.nextLine());

            System.out.print("Enter the second number: ");
            double num2 = getValidInput(scanner.nextLine());

            double result = calculate(num1, operator, num2);

            System.out.println("Result: " + result);

        } catch (InvalidInputException | CannotDivideByZeroException | MaxInputException
                | MaxMultiplierReachedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static double getValidInput(String input) throws InvalidInputException, MaxInputException {
        try {
            double num = Double.parseDouble(input);
            if (num > 100000) {
                throw new MaxInputException("Input cannot be greater than 100000");
            }
            return num;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid input. Please enter a valid number.");
        }
    }

    private static char getValidOperator(String input) throws InvalidInputException {
        if (input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1) {
            throw new InvalidInputException("Invalid operator. Please enter +, -, *, or /.");
        }
        return input.charAt(0);
    }

    private static double calculate(double num1, char operator, double num2)
            throws CannotDivideByZeroException, MaxMultiplierReachedException {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                if (num1 > 7000 || num2 > 7000) {
                    throw new MaxMultiplierReachedException("Multiplication input cannot be greater than 7000");
                }
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new CannotDivideByZeroException("Cannot divide by zero.");
                }
                result = num1 / num2;
                break;
        }

        return result;
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}
