
 import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Temporary variable to store the original number and for calculation
        int temp = num;
        int sum = 0;
        
        // Extract each digit, cube it, and add to sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3); // Cube the digit
            temp /= 10;
        }
        
        // Check if the sum of cubes is equal to the original number
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}

