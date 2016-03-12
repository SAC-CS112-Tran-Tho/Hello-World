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
     
     String choice1;
     String choice2;
     
     System.out.println("Let's play Rock, Paper, Scissor!\n");
     System.out.print("Enter your favorite pick: ");
     choice1 = input.nextLine();
     
     System.out.print("Enter your 2nd favorite pick: ");
     choice2 = input.nextLine();
     
     if ( choice1.equals(choice2))
        System.out.println("Tie game!!");
     else if (choice1.equals("Rock") || choice1.equals("rock"))
     {
        if (choice2.equals("Scissor") || choice2.equals("scissor"))
           System.out.println("Rock beats scissors. You win!!");
        else if (choice2.equals("Paper") || choice2.equals("paper"))
           System.out.println("Paper beats rock. You lose!");
     }
     else if (choice1.equals("Paper") || choice1.equals("paper"))
     {
        if (choice2.equals("Scissor") || choice2.equals("scissor"))
           System.out.println("Scissor cuts paper. You lose!");
        else if (choice2.equals("Rock") || choice2.equals("rock"))
           System.out.println("Paper beats rock. You win!");
     }
     else if (choice1.equals("Scissor") || choice1.equals("scissor"))
     {
        if (choice2.equals("Paper") || choice2.equals("paper"))
           System.out.println("Scissor cuts paper. You win!");
        else if (choice2.equals("Rock") || choice2.equals("rock"))
           System.out.println("Rock beats scissor. You lose!");
     }
     else
           System.out.println("Invalid input. Try again.");
   }
   
}
// Good job!
