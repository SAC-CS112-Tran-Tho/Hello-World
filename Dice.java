
package classwork05.pkg18a;

public class Dice implements RandomNumber
{
   private int randomNum;
   private int counter = 0;
   
   public Dice()
   {      
      Throw();
   } // end Dice constructor
   
   @Override
   public void Throw()
   {
      randomNum = ((int)(Math.random()*6)+1);
      counter++;
   }
    
   @Override
   public int getRandomNumber()
   {
      return randomNum; // generate a random number
   }
   
   @Override
   public int getHistory()
   {
      return counter;     // counts the number of times played
   }
   
   @Override
   public String toString()
   {
      return String.format("%s: %d\n%s %d %s\n", "The random number is", getRandomNumber(), "You played", getHistory(), "times.");
   }
} 
