package classwork04.pkg27b;

public class Dice 
{
   private static int randomNum;
   int counter = 0;
   
   public Dice()
   {
      roll();
   }
   public void roll()
   {
      randomNum = 1 +(int)(Math.random()*6);
   }
   public static int OneThrow()
   {
      return randomNum;
   }
   public static int OneThrow(int dices, int bounces)
   {
      randomNum = 0;
      
      for(int i = 1; i <= bounces; i++)
      {
         randomNum = randomNum + (dices * (1 +(int)Math.random()*6));
      }
      return randomNum;
   }
   public void numberOfTries()
   {
      counter++;
      System.out.print(counter);
   }
}

package classwork04.pkg27b;

import java.util.Scanner;

public class ClassWork0427b 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      Dice dice;
      String guess;
      String dicePlay;
      char answer = '\0';
      
      dice = new Dice();
      
      do{
         dice.roll();
      
         System.out.print("Let's roll a dice. Do you think the outcome is odd or even?: ");
         guess = input.next();
      
         if ((Dice.OneThrow() == 2) || (Dice.OneThrow() == 4) || (Dice.OneThrow() == 6))
         {
            dicePlay = "even";
         }
         else
         {
            dicePlay = "odd";
         }
      
         System.out.printf("After rolling the dice, the number was " + Dice.OneThrow() + 
               " which makes it " + dicePlay + "!\n");
      
         if (guess.equals("even") && dicePlay.equals("even"))
         {
            System.out.print("Its even! You are correct!\n\n");
         }
         else if (guess.equals("odd") && dicePlay.equals("odd"))
         {
            System.out.print("Its odd! You are correct!\n\n");
         }
         else
         {
            System.out.print("You are wrong!\n\n");
         }
         
         System.out.print("You played "); 
         dice.numberOfTries();
         System.out.print(" time(s) so far!\n");
      
         System.out.print("Do you want to continue? (y or n): ");
         answer = input.next(".").charAt(0);
         System.out.print("\n");
          
      } while (answer == 'y');
   }
   
}
