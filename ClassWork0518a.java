
package classwork05.pkg18a;

import java.util.Scanner;

public class ClassWork0518a
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner (System.in);
       
      char answer = '\n';
      
      //  2-element RandomNumber array
      RandomNumber[] randomNumber = new RandomNumber[4];
      
      randomNumber[0] = new Dice();
      randomNumber[1] = new Card();
      randomNumber[2] = new Dice();
      randomNumber[3] = new Card();
      
      do {
         for(RandomNumber currentRandomNumber : randomNumber)
         {
            System.out.println(currentRandomNumber.toString());
           // currentRandomNumber.Throw();
         }
      
         System.out.print("Do you want to continue? (y or n): ");
         answer = input.next(".").charAt(0);
         System.out.print("\n");
         
      } while (answer == 'y'); 
   }   
}
