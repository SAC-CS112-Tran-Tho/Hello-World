// Dice game with percentage of winnings
package dice4;

import java.util.Scanner;

public class Dice4 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      String guess;
      int diceRoll;
      String dicePlay;
      char answer = '\0';
      int numberOfTries = 0;
      int numberOfWins = 0;
      int totalWins = 0;
      
      do{
      diceRoll = 1 +(int)(Math.random()*6);
      numberOfTries++;
      
      System.out.print("Let's roll a dice. Do you think its odd or even?: ");
      guess = input.next();
      
      if ((diceRoll == 2) || (diceRoll == 4) || (diceRoll == 6))
      {
         dicePlay = "even";
      }
      else
      {
         dicePlay = "odd";
      }
      
      System.out.printf("After rolling the die, the number was " + diceRoll + 
              " which makes it " + dicePlay + "!\n");
      
      if (guess.equals("even") && dicePlay.equals("even"))
      {
         System.out.print("Its even! You are correct!\n");
         totalWins = numberOfWins + 1;
      }
      else if (guess.equals("odd") && dicePlay.equals("odd"))
      {
         System.out.print("Its odd! You are correct!\n\n");
         totalWins = numberOfWins + 1;
      }
      else
      {
         System.out.print("You are wrong!\n\n");
      }
      
      System.out.printf("You played " + numberOfTries + " time(s) so far!\n");
      System.out.printf("You won " + ((totalWins/numberOfTries) * 100) + "% of the time!\n");
      
      System.out.print("Do you want to continue? (y or n): ");
      answer = input.next(".").charAt(0);
      System.out.print("\n");
      
    } while (answer == 'y');
   
   }
   
}
