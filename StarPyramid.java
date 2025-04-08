import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for number of rows
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        
        // Printing the pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Moving to the next line
            System.out.println();
        }
        
        scanner.close();
    }
}
