import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;   // Starting balance
        double rate;      // Fixed interest rate
        int year = 1;     // Starting year
        int choice;       // User input to continue or not

        System.out.print("Enter starting balance: ");
        balance = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 0.03 for 3%): ");
        rate = input.nextDouble();

        do {
            // Calculate new balance for the next year
            balance = balance + (balance * rate);
            year++;

            // Display results
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                    year, rate, balance);

            // Ask user if they want to continue
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

        } while (choice == 1);

        System.out.println("---- Program complete ----");
        input.close();
    }
}
