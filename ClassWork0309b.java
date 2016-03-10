// Tho Tran
// Classwork 03-09b
package classwork03.pkg09b;

import java.util.Scanner;

public class Classwork0309b
{

   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      int answer = 1;
      
      System.out.println("Hungry");
      System.out.println("Get in line");
      System.out.println("Buy lunch");
      System.out.print("Are you thirsty? (Enter 1 for yes or 0 for no): ");
      answer = input.nextInt();
      
      if (answer == 1)
         System.out.println("Buy coke");
      
      else
         System.out.println("Get water");
      
      System.out.println("Eat lunch");
      System.out.println("Return tray");
      System.out.println("Leave");
   }
   
}
