import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to check balance
    void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

// Subclass extending BankAccount with an interest feature
class SavingsAccount extends BankAccount {
    double interestRate; // Interest rate in percentage

    // Constructor to initialize savings account with interest rate
    SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest to the balance
    void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
    }
}

// Main class to execute the program
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for account details
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();

        // Creating SavingsAccount object
        SavingsAccount savings = new SavingsAccount(name, accNumber, balance, interestRate);

        int choice;
        do {
            // Menu for user actions
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savings.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    savings.withdraw(withdrawAmount);
                    break;
                case 3:
                    savings.addInterest();
                    break;
                case 4:
                    savings.checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the bank system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
