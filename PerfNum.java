import java.util.Scanner;

    public class PerfNum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt(), sum = 0;
    
            for (int i = 1; i <= num / 2; i++) 
                if (num % i == 0) sum += i;
    
            System.out.println(num + (sum == num ? " is" : " is not") + " a perfect number.");
            sc.close();
        }
    }
    
    
