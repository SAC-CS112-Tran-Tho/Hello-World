
package classwork04.pkg27a;

public class ClassWork0427a 
{
   
   public static void main(String[] args) 
   {
      Automobile Cabbie = new Automobile(4,4);
      Cabbie.SetTransmission(5);
      Cabbie.SetColor("yellow");
      Cabbie.SetName("Cabbie");      
      System.out.println(Cabbie.About());
      
      Automobile Sporty = new Automobile(2,8,7);
      Sporty.SetColor("red");
      Sporty.SetName("Sporty");
      System.out.println(Sporty.About());
      
      Automobile Vany = new Automobile(5,6);
      Vany.SetTransmission(6);
      Vany.SetColor("green");
      Vany.SetName("Vany");
      System.out.println(Vany.About());
   }
}
