
package classwork05.pkg11a;

public class TripleDice extends Dice
{
   private int randomNum;
   
   @Override
   public int Throw()
   {
      randomNum=(super.Throw()+super.Throw()+super.Throw())/3;
      return randomNum;
   }
   
   public String toString()
   {
      return "We rolled 3 dice and the average is: " + Throw();
   }
}


package classwork05.pkg11a;

public class Dice
{
   private int randomNum;
   
   public int Throw()
   {
      randomNum = ((int)(Math.random()*6)+1);
      return randomNum;
   }
   public int Throw(int dices)
   {
      randomNum = dices * ((int)(Math.random()*6)+1);
      return randomNum;
   }
   public int Throw(int dices, int bounces)
   {
      randomNum = dices *((int)(Math.random()*6)+1)+bounces;
      return randomNum;
   }
}


package classwork05.pkg11a;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ClassWork0511a
{
   public static void main(String[] args)
   {
      TripleDice dice = new TripleDice();
      Scanner input = new Scanner(System.in);
      boolean continueLoop = true;  // determines if more input is needed
      
      do
      {      
         try   // rolls 3 dice and calculates average
         {
            System.out.printf("How many dice do you want to roll?: ");
            int num = input.nextInt();
            
            if (num > 3)   // if user enters more than 3 dice, end program
            {
               System.out.println("You cannot roll more than 3 dice.");
               System.exit(0);
            }
            else
               System.out.println(dice);
            
            continueLoop = false;   // input successful; end looping
         }    
         catch (InputMismatchException inputMismatchException)
         {
            System.err.printf("%nException: %s%n", inputMismatchException);
            input.nextLine(); // discard input so user can try again
            System.out.printf("You must enter integers. Please try again.%n%n");
         }
      } while (continueLoop);      
   }
}
// Good job...please also do homework
