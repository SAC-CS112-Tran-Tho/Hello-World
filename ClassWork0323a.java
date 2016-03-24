// Tho Tran
// Classwork 03-23a
// This program a guess-a-number game using GUI
package classwork03.pkg23a;

import javax.swing.JOptionPane;

public class ClassWork0323a 
{
   public static void main(String[] args) 
   {  
      int number;
      int computerNum;
      int counter = 1;
      
      while (counter < 4)
      {
         computerNum = 1 +(int)(Math.random()*10);
         
        // prompt user to enter a number
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
      
         JOptionPane.showMessageDialog(null, "The random number is: " + computerNum + "\n");
      
         if (number > computerNum)
            JOptionPane.showMessageDialog(null, "The number you entered is too big!\n\n");
         else if (number < computerNum)
            JOptionPane.showMessageDialog(null, "The number you entered is too small!\n\n");
         else
            JOptionPane.showMessageDialog(null, "The number you entered is correct!\n\n");
         
         counter++;
      }
   }
   
}
