
    import java.util.Scanner;

    public class CurrencyCal  {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // Display conversion options to the user
        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. USD to AUD");
        System.out.println("3. USD to CAD");
        System.out.println("4. USD to JPY");
        System.out.println("5. USD to CNY");
        System.out.println("6. INR to USD");
        System.out.println("7. INR to AUD");
        System.out.println("8. INR to CAD");
        System.out.println("9. INR to JPY");
        System.out.println("10. INR to CNY");
        System.out.print("Choose an option (1-10): ");
        
        // Take user input for conversion choice
        int choice = s.nextInt();
        
        // Prompt the user to enter the amount they want to convert
        System.out.print("Enter the amount you want to convert: ");
        double amount = s.nextDouble();
        
        // Conversion rates (exchange rates)
        double usdToInr = 82.50; // USD to INR
        double usdToAud = 1.50;  // USD to AUD
        double usdToCad = 1.36;  // USD to CAD
        double usdToJpy = 145.00; // USD to JPY
        double usdToCny = 7.20;  // USD to CNY
        double inrToUsd = 0.012; // INR to USD (inverse of USD to INR)
        
        // Perform the conversion based on user's choice
        switch (choice) {
            case 1: // USD to INR
                System.out.printf("%.2f USD is equal to %.2f INR\n", amount, amount * usdToInr);
                break;
            case 2: // USD to AUD
                System.out.printf("%.2f USD is equal to %.2f AUD\n", amount, amount * usdToAud);
                break;
            case 3: // USD to CAD
                System.out.printf("%.2f USD is equal to %.2f CAD\n", amount, amount * usdToCad);
                break;
            case 4: // USD to JPY
                System.out.printf("%.2f USD is equal to %.2f JPY\n", amount, amount * usdToJpy);
                break;
            case 5: // USD to CNY
                System.out.printf("%.2f USD is equal to %.2f CNY\n", amount, amount * usdToCny);
                break;
            case 6: // INR to USD
                System.out.printf("%.2f INR is equal to %.2f USD\n", amount, amount * inrToUsd);
                break;
            case 7: // INR to AUD
                System.out.printf("%.2f INR is equal to %.2f AUD\n", amount, amount * inrToUsd * usdToAud);
                break;
            case 8: // INR to CAD
                System.out.printf("%.2f INR is equal to %.2f CAD\n", amount, amount * inrToUsd * usdToCad);
                break;
            case 9: // INR to JPY
                System.out.printf("%.2f INR is equal to %.2f JPY\n", amount, amount * inrToUsd * usdToJpy);
                break;
            case 10: // INR to CNY
                System.out.printf("%.2f INR is equal to %.2f CNY\n", amount, amount * inrToUsd * usdToCny);
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid option.");
        }

    
    }
}

    
