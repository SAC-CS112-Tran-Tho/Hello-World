// Dice with number of plays
package dice3;

import java.util.Scanner;

public class Dice3 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      String guess;
      int diceRoll;
      String dicePlay;
      char answer = '\0';
      int numberOfTries = 0;
      
      do{
      diceRoll = 1 +(int)(Math.random()*6);
      numberOfTries++;
      
      System.out.print("Let's roll a dice. Do you think its odd or even?: ");
      guess = input.next();
      
      if ((diceRoll == 2) || (diceRoll == 4) || (diceRoll == 6))
      {
         dicePlay = "even";
      }
      else //if ((diceRoll == 1) && (diceRoll == 3) && (diceRoll == 5))
      {
         dicePlay = "odd";
      }
      
      System.out.printf("After rolling the die, the number was " + diceRoll + 
              " which makes it " + dicePlay + "!\n");
      
      if (guess.equals("even") && dicePlay.equals("even"))
      {
         System.out.print("Its even! You are correct!\n");
      }
      else if (guess.equals("odd") && dicePlay.equals("odd"))
      {
         System.out.print("Its odd! You are correct!\n\n");
      }
      else
      {
         System.out.print("You are wrong!\n\n");
      }
      
      System.out.printf("You played " + numberOfTries + " time(s) so far!\n");
      
      System.out.print("Do you want to continue? (y or n): ");
      answer = input.next(".").charAt(0);
      System.out.print("\n");
      
    } while (answer == 'y');
   }
   
}
