public class StringFunctionDemo {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        System.out.println("Original String: '" + str + "'");

        // 1. Length of string
        System.out.println("Length: " + str.length());

        // 2. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 3. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. Trim whitespace
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 5. Character at index
        System.out.println("Character at index 6: " + str.charAt(6));

        // 6. Substring from index
        System.out.println("Substring from index 7: " + str.substring(7));

        // 7. Substring between indexes
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));

        // 8. String equality
        System.out.println("Equals (case-sensitive): " + str.equals(str2));
        System.out.println("Equals (ignore case): " + str.equalsIgnoreCase(str2));

        // 9. Contains
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 10. Replace
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 11. Index of a character/word
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 13. isEmpty
        //System.out.println("Is string empty: " + str.isEmpty());

        // 14. toCharArray
        char[] chars = str.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();


    }
}
 
