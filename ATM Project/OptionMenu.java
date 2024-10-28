import java.util.Scanner;

// OptionMenu class for displaying account options
public class OptionMenu {
    // Method to display account selection menu
    public void account() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Select the Account you want to access");
        // Display account options
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        // Process user choice for account access
        if (choice == 1) {
            account.currentAccount();
        } else if (choice == 2) {
            account.savingAccount();
        } else if (choice == 3) {
            System.out.println("Thank you for Using the ATM. Goodbye!");
        } else {
            System.out.println("Invalid Choice. Please try Again.");
            account();
        }
    }
}
