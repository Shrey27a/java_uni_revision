import java.util.Scanner;

public class JaggedArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows for the jagged array
        System.out.print("Enter the number of rows in the jagged array: ");
        int rows = sc.nextInt();

        // Declare jagged array with the specified number of rows
        int[][] jagged = new int[rows][];

        // Input elements for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int columns = sc.nextInt();
            jagged[i] = new int[columns];  // Allocate memory for each row

            System.out.println("Enter " + columns + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < columns; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        // Calculating the sum of all elements in the jagged array
        int sum = 0;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                sum += jagged[i][j];
            }
        }

        System.out.println("\nSum of all elements in jagged array: " + sum);
    }
}
 
