// Tho Tran
// Classwork 03-16d
// This program implements a guess-a-number game using conditional operators 
package classwork03.pkg16d;

import java.util.Scanner;

public class ClassWork0316d 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      int number;
      int computerNum;
    
      computerNum = 1 +(int)(Math.random()*10);
      
      System.out.print("Enter a number (1-10): ");
      number = input.nextInt();
      
      System.out.printf("The random number is: " + computerNum + "\n");
      
      if ((number == computerNum) && (number == 7))
      {
         System.out.print("The number you entered is correct! Lucky 7!\n");
      }
      else if ((number > computerNum) || (number < computerNum))
      {
         System.out.printf("The number you entered is incorrect! Try again!\n");
      }
      else
      {
         System.out.print("The number you entered was not within range!\n");
      }
   }
   
}
