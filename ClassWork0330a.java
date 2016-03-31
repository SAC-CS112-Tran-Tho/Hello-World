// Tho Tran
// Classwork 03-30a
package classwork03.pkg30a;

import java.util.Scanner;

public class ClassWork0330a 
{  
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      int thisYear = 2016;
      int birthYear;
      int userAge;
      String name;
      
      System.out.print("Enter your name: ");
      name = input.nextLine();
      
      System.out.print("Enter your birth year: ");
      birthYear = input.nextInt();
      
      userAge = thisYear - birthYear;
      
      System.out.printf("Hello, " + name + ", you're " + userAge + " years-old today!\n");
   }
   
}
