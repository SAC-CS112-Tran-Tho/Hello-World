// Tho Tran
// Classwork 03-16b
// This program implements a guess-a-number game
package classwork03.pkg16b;

import java.util.Scanner;

public class ClassWork0316b 
{   
   public static void main(String[] args)
   {
      Scanner input = new Scanner (System.in);
      
      int computerNum;
      int number;
      
      computerNum = 1 +(int)(Math.random()*10);
      
      System.out.print("Enter a number (1-10): ");
      number = input.nextInt();
      
      System.out.printf("The random number is: " + computerNum + "\n");
      
      if (number > computerNum)
         System.out.print("The number you entered is too big!\n");
      if (number < computerNum)
         System.out.print("The number you entered is too small!\n");
      if (number == computerNum)
         System.out.print("The number you entered is correct!\n");
      else
         System.out.print("The number you entered was not within range!\n");
   }
}
