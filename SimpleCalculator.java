import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for the calculator
        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers:");

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Display operation choices
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Input user's choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Perform operation based on user's choice
        double result;
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default: // Invalid choice
                System.out.println("Error: Invalid choice. Please select 1, 2, 3, or 4.");
                break;
        }

        scanner.close();
    }
}
 
