
package classwork05.pkg03b;

public class ThreeDice
{
   private DiceW12 d1,d2,d3;

   public int Throw()
   {
      int randomNum;
      
      randomNum = (d1.Throw()+d2.Throw()+d3.Throw())/3;

      return randomNum;
   }
   
   public String toString()
   {
      return ("3 dices are rolled and the average number is " + Throw() + ".");    
   }
}


package classwork05.pkg03b;

public class DiceW12
{
   private static int randomNumber;
   
   public static int Throw()
   {
      randomNumber = ((int)(Math.random()*6)+1);
      return randomNumber;
   }
   public static int Throw(int dices)
   {
      randomNumber = dices * ((int)(Math.random()*6)+1);
      return randomNumber;
   }
   public static int Throw(int dices, int bounces)
   {
      randomNumber = dices *((int)(Math.random()*6)+1)+bounces;
      return randomNumber;
   }
}


package classwork05.pkg03b;

public class ClassWork0503b
{
   public static void main(String[] args)
   {
      ThreeDice dice = new ThreeDice();
      
      System.out.println(dice);
   }
   
}
