
package classwork04.pkg27a;

public class Automobile 
{
   private int doors = 0;
   private int cyl = 0;
   private int gears = 0;
   private String color = null;
   private String name = null;
   
   public Automobile (int doors, int cylinders)
   {
      this.doors = doors;
      cylinders = cylinders;
   }
   public Automobile (int doors, int cylinders, int trans)
   {
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
