import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hoursWorked = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        double payRate = input.nextDouble();

        Employee employee = new Employee(9999, payRate);

        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
        
    }
}
