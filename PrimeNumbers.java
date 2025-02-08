import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the upper limit
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();

        // Start checking from 2, the first prime number
        int num = 2;

        System.out.println("Prime numbers up to " + limit + ":");

        while (num <= limit) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false; // Not prime if divisible
            }
            i++;
        }
        return true; // Number is prime
    }
}
 
    

