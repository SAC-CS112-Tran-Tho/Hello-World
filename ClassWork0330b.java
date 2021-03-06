// Tho Tran
// Classwork 03-30b
package classwork03.pkg30b;

import java.util.Scanner;
import java.util.Calendar;

public class ClassWork0330b 
{
   public static void main(String[] args) 
   {
    Scanner input = new Scanner (System.in);
      
    Calendar thisYear = Calendar.getInstance();
    int birthYear;
    int userAge;
    int legalAge = 21;
    String name;     
            
    System.out.print("Enter your name: ");
    name = input.nextLine();
      
    System.out.print("Enter your birth year: ");
    birthYear = input.nextInt();
      
    userAge = thisYear.get(Calendar.YEAR) - birthYear;      
      
    System.out.printf("Hello, " + name + ", you're " + userAge + " years-old today!\n");
            
    if (userAge >= legalAge)
      System.out.print("You are old enough to drink!\n");
    else
      System.out.printf("Sorry, you are not old enough to drink. You must wait " + (legalAge - userAge) + 
               " more years until " + (birthYear + 21) + "to drink!\n");         
   }
}
