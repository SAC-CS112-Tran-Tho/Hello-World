
package classwork04.pkg27b;

public class Dice 
{
   private static int randomNum;
   public static int OneThrow()
   {
      randomNum = 1+(int)(Math.random()*6);
      return randomNum;
   }
   public static int OneThrow(int dices, int bounces)
   {
      randomNum = 0;
      
      for(int i = 1; i <= bounces; i++)
      {
         randomNum = randomNum + (dices * (1 +(int)Math.random()*6));
      }
      return randomNum;
   }
}

package classwork04.pkg27b;

public class ClassWork0427b 
{
   public static void main(String[] args) 
   {
      System.out.println("Let's roll a dice!\nThe outcome of the roll is " + Dice.OneThrow());
   }
   
}
