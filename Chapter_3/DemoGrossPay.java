   class DemoGrossPay{
   
   public static void main (String [] a){
   
   double hours = 25;
   double hoursworked = 37.5;
   
   calgross(10);
   calgross(hours);
   calgross(hoursworked);
   
   
   
   
   }
   
   public static void calgross (double hours){
   
   final double rate = 22.75;
   double gross;
   
   gross = hours * rate;
   System.out.println(hours + "hours at $" + rate + " per hour is $" + gross);
   
   }
}