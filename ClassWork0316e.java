// Tho Tran
// Classwork 03-16c
// This program implements a guess-a-number game with the ? operator
package classwork03.pkg16e;

import java.util.Scanner;

public class ClassWork0316e 
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner (System.in);
      
      int number = 0;
      int computerNum = 0;
      String tooHigh = "The number you entered is too high!\n";
      String tooLow = "The number you entered is too low!\n";
      String correct = "You are correct!\n";
    
      computerNum = 1 +(int)(Math.random()*10);
      
      System.out.print("Enter a number (1-10): ");
      number = input.nextInt();
      
      System.out.printf("The random number is: " + computerNum + "\n");
      
      if (number == computerNum)
      {
         System.out.print(correct);
      }
      else
      {
         System.out.printf(number > computerNum ? tooHigh : tooLow);
      }
   }
}
