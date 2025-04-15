
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the size of square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        // Calculating diagonal sums
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];                 // Primary diagonal
            secondarySum += matrix[i][n - i - 1];       // Secondary diagonal
        }

        System.out.println("\nMatrix:");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
    }
}
 
