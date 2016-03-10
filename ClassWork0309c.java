// Tho Tran
// Classwork 03-09c
package classwork03.pkg09c;

import java.util.Scanner;

public class ClassWork0309c 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      int answer;
      
      System.out.println("Hungry");
      System.out.println("Get in line");
      System.out.println("Buy lunch");
      System.out.print("Are you thirsty? (Enter 1 for yes or 0 for no): ");
      answer = input.nextInt();
      
      if (answer == 1)
      {
         System.out.print("Did you have breakfast? (Enter 1 for yes or 0 for no): ");
         answer = input.nextInt();
      
         if (answer == 1)
            System.out.println("Buy Diet Coke");
         else if (answer == 0)
            System.out.println("Buy Coke");
      }
      else
         System.out.println("Get water");
      
      System.out.println("Eat lunch");
      System.out.println("Return tray");
      System.out.println("Leave");
   }
   
}
