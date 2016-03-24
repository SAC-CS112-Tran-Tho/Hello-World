// Tho Tran
// Classwork 03-23c
// This program implements an array
package classwork03.pkg23c;

import java.util.Arrays;

public class ClassWork0323c 
{
   public static void main(String[] args) 
   {
      int[] aryNums;
      aryNums = new int[6];
      
      aryNums[0] = 123;
      aryNums[1] = 456;
      aryNums[2] = 789;
      aryNums[3] = 135;
      aryNums[4] = 246;
      aryNums[5] = 135;
      
      Arrays.sort(aryNums);
      
      int i;
      
      for (i=0; i<aryNums.length; i++)
      {
         System.out.println("Num: " + aryNums[i]);
      }
   }
   
}
