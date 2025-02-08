import java.util.Scanner;

public class InterestCalculator {
    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate Compound Interest
    public static double calculateCompoundInterest(double principal, double rate, int time, int n) {
        return principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter Principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter Annual Interest Rate (in %):");
        double rate = scanner.nextDouble();

        System.out.println("Enter Time (in years):");
        int time = scanner.nextInt();

        System.out.println("Enter the number of times interest is compounded per year:");
        int n = scanner.nextInt();

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        // Calculate Compound Interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}

