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
     
     String userChoice;    // user enters rock, paper, or scissor
     int computerChoice;
     String computerPlay;
     int counter = 1;
     
     while (counter < 4)
     {
     computerChoice = 1 +(int)(Math.random()*3);
        
     System.out.println("Let's play (R)ock, (P)aper, (S)cissor!\n");
     System.out.print("Enter your favorite pick: ");
     userChoice = input.nextLine();       // user enters first pick
     
     if (computerChoice == 1)
     {
        computerPlay = "R";
     }
     else if (computerChoice == 2)
     {
        computerPlay = "P";
     }
     else
     {
        computerPlay = "S";
     }
     
     System.out.printf("The computer picked: " + computerPlay + "\n");
     
     if (userChoice.equals(computerPlay))     // tie game if the choices are the same
     {
        System.out.println("Tie game!!\n");
     }
     else if ((userChoice.equals("R") && computerPlay.equals("P")) ||
             ((userChoice.equals("P") && computerPlay.equals("S")))||
             ((userChoice.equals("S") && computerPlay.equals("R"))))
     {
        System.out.println("You lose!\n");      
     }
     else
     {
           System.out.println("You win!\n");
     }
     
     counter++;
     }
   }
}
