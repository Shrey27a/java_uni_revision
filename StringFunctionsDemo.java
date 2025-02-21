import java.util.Scanner;

public class StringFunctionsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Demonstrating String Functions
        System.out.println("\n--- String Functions Implementation ---");
        System.out.println("Original String: " + str);

        // 1. Length of the string
        System.out.println("Length: " + str.length());

        // 2. Convert to Uppercase & Lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 3. Check if string is empty
        System.out.println("Is Empty: " + str.isEmpty());

        // 4. Trim extra spaces
        System.out.println("Trimmed String: '" + str.trim() + "'");

        // 5. Substring (Extract a part of the string)
        if (str.length() >= 5) {
            System.out.println("Substring (first 5 chars): " + str.substring(0, 5));
        }

        // 6. Replace a character
        System.out.println("Replacing 'a' with '@': " + str.replace('a', '@'));

        // 7. Check if string contains a particular word
        System.out.print("Enter a word to check in the string: ");
        String word = scanner.next();
        System.out.println("Contains '" + word + "': " + str.contains(word));

        // 8. Find position of a character
        System.out.print("Enter a character to find its index: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Index of '" + ch + "': " + str.indexOf(ch));

        // 9. Check if string starts or ends with a specific substring
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'world': " + str.endsWith("world"));

        // 10. Split string into words
        System.out.println("Splitting words:");
        String[] words = str.split(" ");
        for (String w : words) {
            System.out.println("- " + w);
        }

        // 11. Concatenation of two strings
        System.out.print("Enter another string to concatenate: ");
        scanner.nextLine(); // Consume newline
        String str2 = scanner.nextLine();
        System.out.println("Concatenated String: " + str.concat(str2));

        // 12. Character at a specific index
        System.out.print("Enter an index to get character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index!");
        }

        // 13. Compare two strings (equals and compareTo)
        System.out.print("Enter another string to compare: ");
        scanner.nextLine(); // Consume newline
        String str3 = scanner.nextLine();
        System.out.println("Equal to '" + str3 + "': " + str.equals(str3));
        System.out.println("Comparing with '" + str3 + "': " + str.compareTo(str3));

        scanner.close();
    }
}

