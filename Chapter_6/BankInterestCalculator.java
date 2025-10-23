import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;  
        double rate;     
        int year = 1;     
        int choice;       

        System.out.print("Enter starting balance: ");
        balance = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 0.03 for 3%): ");
        rate = input.nextDouble();

        do {
            
            balance = balance + (balance * rate);
            year++;

           
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                    year, rate, balance);

          
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

        } while (choice == 1);

        System.out.println("---- Program complete ----");
        input.close();
    }
}
