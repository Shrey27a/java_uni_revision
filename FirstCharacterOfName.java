public class FirstCharacterOfName {
    public static void main(String[] args) {
        int rows = 7;   // Height of the "S"
        int cols = 15;  // Width of the "S"

        // Loop to print the "S" pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Top part of the "S"
                if (i == 0 && j < cols - 1) {
                    System.out.print("*");
                }
                // Bottom part of the "S"
                else if (i == rows - 1 && j > 0) {
                    System.out.print("*");
                }
                // Middle part of the "S"
                else if (i == rows / 2 && j > 0 && j < cols - 1) {
                    System.out.print("*");
                }
                // Upper-left slant of the "S"
                else if (i < rows / 2 && j == 0) {
                    System.out.print("*");
                }
                // Lower-right slant of the "S"
                else if (i > rows / 2 && j == cols - 1) {
                    System.out.print("*");
                }
                // Filling for right curve (upper part)
                else if (i > 0 && i < rows / 2 && j == cols - 2) {
                    System.out.print("*");
                }
                // Filling for right curve (lower part)
                else if (i > rows / 2 && i < rows - 1 && j == cols - 2) {
                    System.out.print("*");
                }
                // Filling for left side of the lower half of the "S"
                else if (i > rows / 2 && j == 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
