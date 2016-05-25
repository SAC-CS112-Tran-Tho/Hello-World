
package classwork05.pkg18a;

public class Card implements RandomNumber
{
   private int cardRank;
   private int counter = 0;
   
   public Card()
   {      
      Throw();
   }
   
   @Override
   public void Throw()
   {
      cardRank = ((int)(Math.random()*13)+1);
      counter++;
   }
    
   public String cardRankToFace(int rank)
   {
      switch (rank)
      {
         case 1:
            return "Ace";
         case 2:
            return "Two";
         case 3:
            return "Three";
         case 4:
            return "Four";
         case 5:
            return "Five";
         case 6:
            return "Six";
         case 7:
            return "Seven";
         case 8:
            return "Eight";
         case 9:
            return "Nine";
         case 10:
            return "Ten";
         case 11:
            return "Jack";
         case 12:
            return "Queen";
         case 13:
            return "King";
         default:
            return null;
      }
   }
   
   @Override
   public int getRandomNumber()
   {
      return cardRank;
   }
   
   @Override
   public int getHistory()
   {
      return counter;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s: %s\n%s %d %s\n", "Your random card is", cardRankToFace(getRandomNumber()), "You played", getHistory(), "times.");
   }
   
}
