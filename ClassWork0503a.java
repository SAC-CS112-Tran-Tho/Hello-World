
package classwork0503a;

import javax.swing.JOptionPane;

public class ClassWork0503a
{
   public static void main(String[] args)
   {
      int bounces = (int)(Math.random() *(100) + 1);
		int dices = Integer.parseInt(JOptionPane.showInputDialog("What is the number of dices to throw?"));
		Dice test = new Dice(bounces);	
		
		test.Throw(dices, bounces);

		// test.OneThrow();
		 
		
		JOptionPane.showMessageDialog(null,"The final value is " + test.Value());
	
   }
   
}
