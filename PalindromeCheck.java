import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Using StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        // Checking if the original string is equal to the reversed string
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}
