// Dice
package dice;

import java.util.Scanner;

public class Dice 
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner (System.in);
      
      String guess;
      int diceRoll;
      String dicePlay;
      
      diceRoll = 1 +(int)(Math.random()*6);
      
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
         System.out.print("Its odd! You are correct!\n");
      }
      else
      {
         System.out.print("You are wrong!\n");
      }
      
   }
   
}
