import java.util.Scanner;

// Main class to run the ATM project
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OptionMenu opt = new OptionMenu();
        Account account = new Account();

        System.out.println("Welcome to the ATM Project!");

        int attempts =0;
        final int maxAttempts =3;

        while (attempts<maxAttempts) { // Loop until valid credentials are entered
            System.out.print("Enter Your Customer Number: ");
            int cNo = scanner.nextInt();
            System.out.print("Enter Your Pin Number: ");
            int pNo = scanner.nextInt();

            // Validate credentials
            if (cNo == 12345 && pNo == 1234 || cNo == 54321 && pNo == 4321) {
                opt.account(); // Access account options if credentials are valid
                break; // Exit the loop on successful login
            } else {
                attempts++;
                System.out.println("Incorrect Pin or Account Number. Please try again."); // Prompt for re-entry
                if(attempts>=maxAttempts){
                    System.out.println("Maximum Attempts Reached .Exiting");
                }
            }
        }
    }
}
