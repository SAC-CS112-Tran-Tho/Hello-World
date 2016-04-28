
package classwork04.pkg27a;

public class Automobile2 
{
   private int doors = 0;
   private int cyl = 0;
   private int gears = 0;
   private String color = null;
   private String name = null;

   public Automobile2 (String color, int doors, int cylinders, int trans)
   {
      this.color = color;
      this.doors = doors;
      cylinders = cylinders;
      trans = trans;
   }
   public void SetNumberOfDoors(int d)
   {
      doors = d;
   }
   public void SetNumberOfCylinders(int c)
   {
      cyl = c;
   }
   public void SetTransmission(int t)
   {
      gears = t;
   }
   public void SetColor(String c)
   {
      color = c;
   }
   public void SetName(String n)
   {
      name = n;
   }
   public String About()
   {
      String description =
      String.format("A " + color + " " + doors + " door named " + name);
      return description;
   }
}


package classwork04.pkg27a;

public class ClassWork0427a 
{
   
   public static void main(String[] args) 
   {
      Automobile2 Cabbie = new Automobile2("yellow",4,4,5);
      Cabbie.SetTransmission(5);
      Cabbie.SetColor("yellow");
      Cabbie.SetName("Cabbie");      
      System.out.println(Cabbie.About());
      
      Automobile2 Sporty = new Automobile2("red",2,6,5);
      Sporty.SetColor("red");
      Sporty.SetName("Sporty");
      System.out.println(Sporty.About());
      
      Automobile2 Vany = new Automobile2("green",5,6,6);
      Vany.SetTransmission(6);
      Vany.SetColor("green");
      Vany.SetName("Vany");
      System.out.println(Vany.About());
   }
}

