 import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the original string
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();

        // Input the word to find
        System.out.print("Enter the word to find: ");
        String find = sc.nextLine();

        // Input the word to replace with
        System.out.print("Enter the word to replace it with: ");
        String replace = sc.nextLine();

        // Replacing all occurrences
        String result = original.replace(find, replace);

        // Output
        System.out.println("Modified string: " + result);
    }
}
 
