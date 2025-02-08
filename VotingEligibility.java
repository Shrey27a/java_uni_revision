import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Age of the person
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // Input: Citizenship status
        System.out.println("Are you a citizen of the country? (yes/no):");
        String citizenship = scanner.next();

        // Check eligibility
        if (age >= 18 && citizenship.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
 
