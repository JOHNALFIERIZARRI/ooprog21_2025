import java.util.Scanner;

class StringBuilderDemo {
   public static void main(String[] args){
      
      StringBuilder ha = new StringBuilder("Barbara");
      StringBuilder he = new StringBuilder("6311 Hickory Nut Grove Road");
      
      int first = ha.capacity();
      int second = he.capacity();
      
      System.out.println("(StringBuilder 1) nameString: "+ha);
      System.out.println("Capacity of nameString is: "+first); 
      
      
      System.out.println("(StringBuilder 2) nameString: "+he);
      System.out.println("Capacity of nameString is: "+second);
      
      ha.setLength(20);
      System.out.println("(Length set to 20 for StringBuilder 1)The name is "+ha);
      he.setLength(20);
      System.out.println("(Length set to 20 for StringBuilder 2)The adress is "+he);
   }
}