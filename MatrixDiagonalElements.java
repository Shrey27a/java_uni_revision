import java.util.Scanner;

public class MatrixDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for matrix size
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print primary diagonal (Left to Right Bottom)
        System.out.print("\nPrimary Diagonal (Left to Right Bottom): ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        // Print secondary diagonal (Left Bottom to Right)
        System.out.print("\nSecondary Diagonal (Left Bottom to Right): ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }

        // Close scanner
        scanner.close();
    }
}
