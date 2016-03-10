// Tho Tran
// Classwork 03-09
package classwork03.pkg09a;

import java.util.Scanner;

public class ClassWork0309a
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
      
      System.out.println("Eat lunch");
      System.out.println("Return tray");
      System.out.println("Leave");
   }
   
}
