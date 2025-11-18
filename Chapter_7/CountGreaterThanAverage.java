public class CountGreaterThanAverage {
    
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        
        System.out.println(countGreaterThanPreviousAverage(responseTimes));
    }

    public static int countGreaterThanPreviousAverage(int[] responseTimes) {
        int count = 0;
        double sum = 0; 
        
        for (int i = 1; i < responseTimes.length; i++) {
            sum += responseTimes[i - 1]; 
            double average = sum / i; 
            
            if (responseTimes[i] > average) {
                count++; 
            }
        }
        
        return count;
    }
}
