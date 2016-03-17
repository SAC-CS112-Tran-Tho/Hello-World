// Tho Tran
// Classwork 03-16f
// This program implements a guess-a-number game using a while loop
// to allow the player to play 3 times
package classwork03.pkg16g;

import java.util.Scanner;

public class ClassWork0316g 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      int number;
      int computerNum;
      int counter = 1;
      
      while (counter < 4)
      {
         computerNum = 1 +(int)(Math.random()*10);
         
         System.out.print("Enter a number (1-10): ");
         number = input.nextInt();
      
         System.out.printf("The random number is: " + computerNum + "\n");
      
         if (number > computerNum)
            System.out.print("The number you entered is too big!\n\n");
         else if (number < computerNum)
            System.out.print("The number you entered is too small!\n\n");
         else
            System.out.print("The number you entered is correct!\n\n");
         
         counter++;
      }
   }
   
}
