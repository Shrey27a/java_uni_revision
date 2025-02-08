public class ReversePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

