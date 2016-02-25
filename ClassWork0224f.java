// Tho Tran
// Display addition of numbers after input
package classwork0224f;

import java.util.Scanner;

public class ClassWork0224f {

   public static void main(String[] args)
   { 
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);
      
      int num1; // first number
      int num2; // second number
      int sum; // sum of num1 and num2
      int sub; // difference of num1 and num2
      int prod; // product of num1 and num2
      int quo; // quotient of num1 and num2
      
      System.out.print("Enter first integer: "); // prompt
      num1 = input.nextInt(); // read first number from user
      
      System.out.print("Enter second integer: "); // prompt
      num2 = input.nextInt(); // read second number from user
      
      sum = num1 + num2; // add numbers, then store total in sum
      sub = num1 - num2;
      prod = num1 * num2;
      quo = num1 / num2;
      
      // display
      System.out.printf("Hello, you entered " + num1 + " and " + num2);
      System.out.printf("\nSum is %d\n", sum); // display sum
      System.out.printf("Difference is %d\n", sub); // display difference
      System.out.printf("Product is %d\n", prod); // display product
      System.out.printf("Quotient is %d\n", quo); // display quotient
   } // end
   
} // end

