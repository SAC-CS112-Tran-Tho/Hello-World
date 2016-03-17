// Tho Tran
// This program implements a calculator 
// using conditional statements
package hw5_calculator;

import java.util.Scanner; 

public class HW5_Calculator 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner (System.in);
      
      int num1;
      int num2;
      String operator;
      
      System.out.printf("Which math operation do you want to perform?\n" +
        "(Enter +(addition), -(subtraction), /(division), *(multiplication): ");
      operator = input.nextLine();
      
      System.out.print("Enter a number: ");
      num1 = input.nextInt();
      
      System.out.print("Enter another number: ");
      num2 = input.nextInt();
      
      if (operator.equals("+"))
      {
         System.out.printf(num1 + " + " + num2 + " = ");
         System.out.print(num1 + num2 + "\n");
      }
      else if (operator.equals("-"))
      {
         System.out.printf(num1 + " - " + num2 + " = ");
         System.out.print(num1 - num2 + "\n");
      }
      else if (operator.equals("/"))
      {
         System.out.printf(num1 + " / " + num2 + " = ");
         System.out.print(num1 / num2 + " remainder: " + num1 % num2 + "\n");
      }
      else if (operator.equals("*"))
      {
         System.out.printf(num1 + " * " + num2 + " = ");
         System.out.print(num1 * num2 + "\n");
      }
      else
         System.out.print("Error!\n");
   }
}
// Good job...please see if you can reduce the number of println statements
