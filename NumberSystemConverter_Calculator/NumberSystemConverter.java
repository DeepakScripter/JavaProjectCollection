import java.util.Scanner;

public class NumberSystemConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Decimal to Octal");
            System.out.println("3. Decimal to Hexadecimal");
            System.out.println("4. Binary to Decimal");
            System.out.println("5. Binary to Octal");
            System.out.println("6. Binary to Hexadecimal");
            System.out.println("7. Octal to Decimal");
            System.out.println("8. Octal to Hexadecimal");
            System.out.println("9. Octal to Binary");
            System.out.println("10. Hexadecimal to Decimal");
            System.out.println("11. Hexadecimal to Binary");
            System.out.println("12. Hexadecimal to Octal");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    decimalToBinary();
                    break;
                case 2:
                    decimalToOctal();
                    break;
                case 3:
                    decimalToHexadecimal();
                    break;
                case 4:
                    binaryToDecimal();
                    break;
                case 5:
                    binaryToOctal();
                    break;
                case 6:
                    binaryToHexadecimal();
                    break;
                case 7:
                    octalToDecimal();
                    break;
                case 8:
                    octalToHexadecimal();
                    break;
                case 9:
                    octalToBinary();
                    break;
                case 10:
                    hexadecimalToDecimal();
                    break;
                case 11:
                    hexadecimalToBinary();
                    break;
                case 12:
                    hexadecimalToOctal();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void decimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
    }

    private static void decimalToOctal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }

    private static void decimalToHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
    }

    private static void binaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        System.out.println("Decimal: " + Integer.parseInt(binary, 2));
    }

    private static void binaryToOctal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }

    private static void binaryToHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
    }

    private static void octalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        System.out.println("Decimal: " + Integer.parseInt(octal, 8));
    }

    private static void octalToHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
    }

    private static void octalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
    }

    private static void hexadecimalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        System.out.println("Decimal: " + Integer.parseInt(hexadecimal, 16));
    }

    private static void hexadecimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
    }

    private static void hexadecimalToOctal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }
}
