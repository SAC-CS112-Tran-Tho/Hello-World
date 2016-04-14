// Tho Tran
// Random.java
package guessanumber;

public class RandomNumber 
{
   private int num;
   public int GetANumber_Between_1_and_10()
   {
      num = 1 + (int)(Math.random()*10);
      return num;   
   }   
}

// GuessANumber.java
// Creating a RandomNumber object and calling its GetANumber_Between_1_and_10 method
package guessanumber;

public class GuessANumber
{
   // main method begins
   public static void main(String[] args) 
   {
      // create a RandomNumber object and assign it to newNumber
      RandomNumber num = new RandomNumber();
      
      System.out.print("Here is a random number: " + num.GetANumber_Between_1_and_10() + "\n");
   }
   
}
