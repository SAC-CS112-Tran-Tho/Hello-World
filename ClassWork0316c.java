// Tho Tran
// Classwork 03-16c
// This program implements a guess-a-number game with else-if and else statements
package classwork03.pkg16c;

import java.util.Scanner;

public class ClassWork0316c 
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
      
      if (number > computerNum)
         System.out.print("The number you entered is too big!\n");
      else if (number < computerNum)
         System.out.print("The number you entered is too small!\n");
      else
         System.out.print("The number you entered is correct!\n");
   }
   
}
