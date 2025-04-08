 import java.util.Scanner;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Take input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display even numbers
        System.out.print("Even numbers in the array: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
