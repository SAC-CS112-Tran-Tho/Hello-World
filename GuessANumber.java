// GuessANumber.java
// Creating a RandomNumber object and calling its GetANumber method
package guessanumber;

import java.util.Scanner;

public class GuessANumber
{
   // main method begins
   public static void main(String[] args) 
   {
      // Todo auto-generated method
      Scanner input = new Scanner (System.in);
      int myRandomNum;
      int numberGuess;
      int lowNumber;
      int highNumber;
      RandomNumber randomNumber = new RandomNumber();
      
      // set low random number
      System.out.print("Please enter a low random number: ");
      lowNumber = input.nextInt();
      randomNumber.SetLowNumber(lowNumber);
      // set high random number
      System.out.print("Please enter a high random number: ");
      highNumber = input.nextInt();
      randomNumber.SetHighNumber(highNumber);
      // set user's number
      System.out.printf("Please enter a number between %d and %d: ", lowNumber, highNumber);
      numberGuess = input.nextInt();
      myRandomNum = randomNumber.GetANumber();
      
      if (numberGuess == myRandomNum)
      System.out.printf("Congratulations, you guessed it! The correct number is %d!\n", numberGuess);
      else if (numberGuess > myRandomNum)
      System.out.printf("Your number is too high. Your number is %d, the computer's number is %d\n", numberGuess, myRandomNum);
      else
      System.out.printf("Your number is too low. Your number is %d, the computer's number is %d\n", numberGuess, myRandomNum);
   }
   
}
