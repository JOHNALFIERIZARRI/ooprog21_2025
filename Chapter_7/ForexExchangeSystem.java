import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[currencies.length][5];

        System.out.println("===== FOREX EXCHANGE SYSTEM =====\n");

      
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Enter exchange rates for " + currencies[i] + ":");
            for (int day = 0; day < 5; day++) {
                System.out.print("Day " + (day + 1) + ": ");
                rates[i][day] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("\n================ EXCHANGE RATE TABLE ================\n");
        System.out.printf("%-10s", "Currency");

        for (int day = 1; day <= 5; day++) {
            System.out.printf("Day%-6d", day);
        }
        System.out.println();

        for (int i = 0; i < currencies.length; i++) {
            System.out.printf("%-10s", currencies[i]);
            for (int day = 0; day < 5; day++) {
                System.out.printf("%-8.2f", rates[i][day]);
            }
            System.out.println();
        }

        
        System.out.println("\n================ PEAK & LOWEST RATES ================\n");
        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double low = rates[i][0];

            for (int day = 1; day < 5; day++) {
                if (rates[i][day] > peak) peak = rates[i][day];
                if (rates[i][day] < low) low = rates[i][day];
            }

            System.out.println(currencies[i] + ":");
            System.out.println("   Highest: " + peak);
            System.out.println("   Lowest : " + low);
            System.out.println();
        }

        System.out.println("\n================ DAILY CHANGES ================\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println(currencies[i] + ":");

            for (int day = 1; day < 5; day++) {
                System.out.print(" Day " + day + " to Day " + (day + 1) + ": ");

                if (rates[i][day] > rates[i][day - 1]) {
                    System.out.println("Increase (" + rates[i][day - 1] + " → " + rates[i][day] + ")");
                } else if (rates[i][day] < rates[i][day - 1]) {
                    System.out.println("Decrease (" + rates[i][day - 1] + " → " + rates[i][day] + ")");
                } else {
                    System.out.println("No Change (" + rates[i][day] + ")");
                }
            }
            System.out.println();
        }

        System.out.println("=============== END OF REPORT ===============");
        sc.close();
    }
}
