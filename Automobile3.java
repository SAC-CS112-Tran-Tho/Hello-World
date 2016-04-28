
package classwork04.pkg27a;

public class Automobile3
{
   private int doors = 0;
   private int cyl = 0;
   private int gears = 0;
   private String color = null;
   private String name = null;

   public Automobile3 (String name, String color, int doors, int cylinders, int trans)
   {
      this.name = name;
      this.color = color;
      this.doors = doors;
      cyl = cylinders;
      gears = trans;
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
      String.format("A " + color + " " + doors + " door named " + name + " has " + cyl + " cylinders and " + gears + " gears.");
      return description;
   }
}


package classwork04.pkg27a;

public class ClassWork0427a 
{
   
   public static void main(String[] args) 
   {
      Automobile3 Cabbie = new Automobile3("Cabbie","yellow",4,4,5);
      //Cabbie.SetTransmission(5);
      //Cabbie.SetColor("yellow");
      //Cabbie.SetName("Cabbie");      
      System.out.println(Cabbie.About());
      
      Automobile3 Sporty = new Automobile3("Sporty","red",2,6,5);
      //Sporty.SetColor("red");
      //Sporty.SetName("Sporty");
      System.out.println(Sporty.About());
      
      Automobile3 Vany = new Automobile3("Vany","green",5,6,6);
      //Vany.SetTransmission(6);
      //Vany.SetColor("green");
      //Vany.SetName("Vany");
      System.out.println(Vany.About());
   }
}

