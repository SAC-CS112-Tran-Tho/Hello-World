
package classwork04.pkg27b;

public class Dice7
{
   private static int randomNum;
   public static int OneThrow()
   {
      randomNum = 1+(int)(Math.random()*6);
      return randomNum;
   }
}


package classwork04.pkg27b;

public class ClassWork0427b 
{
   public static void main(String[] args) 
   {
      System.out.println("Let's roll a dice!\nThe outcome of the roll is " + Dice7.OneThrow());
   }
}
