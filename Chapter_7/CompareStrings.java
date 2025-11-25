import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userName = input.nextLine();

        String predefined = "Carmen";

        if (userName.equals(predefined)) {
            System.out.println(predefined + " equals " + userName);
        } else {
            System.out.println(predefined + " does not equal " + userName);
        }

        input.close();
    }
}
