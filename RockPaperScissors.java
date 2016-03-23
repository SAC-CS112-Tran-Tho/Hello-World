// CS112 Homework 4
// Rock Paper Scissors
package rock.paper.scissors;
import java.util.Scanner;

// Tho Tran

public class RockPaperScissors 
{
   // This program implements a rock-paper-scissor game
   public static void main(String[] args) 
   {
     Scanner input = new Scanner ( System.in );
     
     String choice1;    // user enters rock, paper, or scissor
     String choice2;    // user enters another of the three choices
     int counter = 1;
     
     while (counter < 4)
     {
     System.out.println("Let's play Rock, Paper, Scissor!\n");
     System.out.print("Enter your favorite pick: ");
     choice1 = input.nextLine();       // user enters first pick
     
     System.out.print("Enter your 2nd favorite pick: ");
     choice2 = input.nextLine();       // user enters second pick
     
     if ( choice1.equals(choice2))     // tie game if the choices are the same
        System.out.println("Tie game!!\n");
     else if (choice1.equals("Rock") || choice1.equals("rock"))   // if rock
     {
        if (choice2.equals("Scissor") || choice2.equals("scissor"))
           System.out.println("Rock beats scissors. You win!!\n");  // rock wins
        else if (choice2.equals("Paper") || choice2.equals("paper"))
           System.out.println("Paper beats rock. You lose!\n");     // rock loses
     }
     else if (choice1.equals("Paper") || choice1.equals("paper")) // if paper
     {
        if (choice2.equals("Scissor") || choice2.equals("scissor"))
           System.out.println("Scissor cuts paper. You lose!\n");   // paper loses
        else if (choice2.equals("Rock") || choice2.equals("rock"))
           System.out.println("Paper beats rock. You win!\n");      // paper wins
     }
     else if (choice1.equals("Scissor") || choice1.equals("scissor")) // if scissor
     {
        if (choice2.equals("Paper") || choice2.equals("paper"))
           System.out.println("Scissor cuts paper. You win!\n");    // scissor wins
        else if (choice2.equals("Rock") || choice2.equals("rock"))
           System.out.println("Rock beats scissor. You lose!\n");   // scissor loses
     }
     else
     {
           System.out.println("Invalid input. Try again.\n");  // choice does not match
     }
     
     counter++;
     }
   }
}
