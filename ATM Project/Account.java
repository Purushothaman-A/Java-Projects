import java.util.Scanner;

// Account class for managing current and savings accounts
public class Account extends OptionMenu {
    Scanner scanner = new Scanner(System.in);
    static double bal = 0;
    static double sBal = 0;

    // Method to handle current account operations
    void currentAccount() {
        System.out.println("Checking Account");
        // Display menu options for current account
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Balance");
        System.out.println("Type 3 - Deposit Funds ");
        System.out.println("Type 4 - Back to Account Menu ");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        // Process user choice for current account
        if (choice == 1) {
            System.out.println("Your Balance is $" + bal); // Show balance
            currentAccount();
        } else if (choice == 2) {
            // Withdraw funds from current account
            System.out.print("Enter Amount to Withdraw: ");
            int withdrawAmount = scanner.nextInt();
            if (bal >= withdrawAmount) {
                bal -= withdrawAmount; // Update balance
                System.out.println("Your New Balance is $" + bal);
            } else {
                System.out.println("Insufficient Funds");
            }
            currentAccount();
        } else if (choice == 3) {
            // Deposit funds into current account
            System.out.print("Enter Amount to Deposit: ");
            int dep = scanner.nextInt();
            bal += dep; // Update balance
            System.out.println("Your New Balance is $" + bal);
            currentAccount();
        } else if (choice == 4) {
            account(); // Back to account menu
        } else {
            System.out.println("Invalid Choice. Try again."); // Error message for invalid choice
            currentAccount(); // Repeat menu
        }
    }

    // Method to handle savings account operations
    void savingAccount() {
        System.out.println("Savings Account");
        // Display menu options for savings account
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Balance");
        System.out.println("Type 3 - Deposit Funds ");
        System.out.println("Type 4 - Back to Account Menu ");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        // Process user choice for savings account
        if (choice == 1) {
            System.out.println("Your Balance is $" + sBal);
            savingAccount();
        } else if (choice == 2) {
            // Withdraw funds from savings account
            System.out.print("Amount to Withdraw: ");
            int withdrawAmount = scanner.nextInt();
            if (sBal >= withdrawAmount) {
                sBal -= withdrawAmount; // Update balance
                System.out.println("Your New Balance is $" + sBal);
            } else {
                System.out.println("Insufficient Funds"); // Error message for insufficient funds
            }
            savingAccount();
        } else if (choice == 3) {
            // Deposit funds into savings account
            System.out.print("Amount to Deposit: ");
            int dep1 = scanner.nextInt();
            sBal += dep1;
            System.out.println("Your New Balance is $" + sBal);
            savingAccount();
        } else if (choice == 4) {
            account();
        } else {
            System.out.println("Invalid Choice. Try again.");
            savingAccount();
        }
    }
}
