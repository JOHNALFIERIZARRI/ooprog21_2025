import java.util.Arrays;

public class ArraysDemo {

    private static final int LABEL_WIDTH = 28; 


    public static void main(String[] args) {
        
        int[] numbers = new int[5];

      
        display("Original array:", numbers);

       
        Arrays.fill(numbers, 8);
        display("After filling with 8s:", numbers);

       
        numbers[1] = 6;
        numbers[3] = 3;
        display("After changing two values:", numbers);

        Arrays.sort(numbers);
        display("After sorting:", numbers);
    }

    
    public static void display(String message, int[] array) {
        System.out.print(message);

        
        int spaces = LABEL_WIDTH - message.length();
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
