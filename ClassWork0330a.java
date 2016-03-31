// Tho Tran
// Classwork 03-30a
package classwork03.pkg30a;

import java.util.Scanner;
import java.util.Calendar;

public class ClassWork0330a 
{  
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      int birthYear;
      int userAge;
      String name;
      
      Calendar thisYear = Calendar.getInstance();
      
      System.out.print("Enter your name: ");
      name = input.nextLine();
      
      System.out.print("Enter your birth year: ");
      birthYear = input.nextInt();
      
      userAge = thisYear.get(Calendar.YEAR) - birthYear;
      
      System.out.printf("Hello, " + name + ", you're " + userAge + " years-old today!\n");
   }
   
}
