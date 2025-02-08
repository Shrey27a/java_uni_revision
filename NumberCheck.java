import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using nested ternary operator to check the number
        String result = (number > 0) ? "Positive" :
                        (number < 0) ? "Negative" : "Zero";

        // Display the result
        System.out.println("The number is: " + result);

        scanner.close();
    }
}
