public class Employee {
    private int employeeNumber;
    private double payRate;
    private double maxRate;

    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.maxRate = 60.00;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getMaxRate() {
        return maxRate;
    }

    public double calculateRegularPay(int hoursWorked) {
        return (hoursWorked <= 40) ? hoursWorked * payRate : 40 * payRate;
    }

    public double calculateOvertimePay(int hoursWorked) {
        if (hoursWorked > 40) {
            return (hoursWorked - 40) * (payRate * 1.5);
        } else {
            return 0.0;
        }
    }
}
