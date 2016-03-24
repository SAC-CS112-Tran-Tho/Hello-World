// Tho Tran
// Classwork 03-23b
// This program implements a guess-a-number game with a do-while loop
package classwork03.pkg23b;

import javax.swing.JOptionPane;

public class ClassWork0323b 
{
   public static void main(String[] args) 
   {
      int number;
      int computerNum;
      int counter = 1;
      
      do
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
      } while (counter < 4);
   }   
}
