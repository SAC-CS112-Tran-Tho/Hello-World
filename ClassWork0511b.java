
package classwork05.pkg11a;

public class TripleDice extends Dice
{
   private int randomNum;
   
   @Override
   public int Throw()
   {
      randomNum=(super.Throw()+super.Throw()+super.Throw())/3;
      return randomNum;
   }
   
   public String toString()
   {
      return "We rolled 3 dice and the average is: " + Throw();
   }
}


package classwork05.pkg11a;

public class Dice
{
   private int randomNum;
   
   public int Throw()
   {
      randomNum = ((int)(Math.random()*6)+1);
      return randomNum;
   }
   public int Throw(int dices)
   {
      randomNum = dices * ((int)(Math.random()*6)+1);
      return randomNum;
   }
   public int Throw(int dices, int bounces)
   {
      randomNum = dices *((int)(Math.random()*6)+1)+bounces;
      return randomNum;
   }
}


package classwork05.pkg11a;

public class ClassWork0511a
{
   public static void main(String[] args)
   {
      TripleDice dice = new TripleDice();
      
      System.out.println(dice);
   }
}
