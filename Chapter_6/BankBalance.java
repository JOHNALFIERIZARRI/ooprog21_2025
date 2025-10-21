import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default interest rate
        final double INTEREST_RATE = 0.03;

        // Prompt user for initial bank balance
        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();

        int year = 1;
        int choice;

        // Ask if user wants to continue
        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        choice = scanner.nextInt();

        // WHILE loop runs as long as user enters 1
        while (choice == 1) {
            // Apply interest
            balance += balance * INTEREST_RATE;

            // Display balance
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, INTEREST_RATE, balance);

            year++;

            // Ask again if user wants to continue
            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = scanner.nextInt();
        }

        System.out.println("\nThank you! Program ended.");
    }
}
