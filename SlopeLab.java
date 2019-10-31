/***********************************
 William Chaalan   Period: 2
 SlopeLab
 Purpose: calculate the slope of a line

 What I learned:
 a. if statements
 b. else if and else
 Credits: lab packet, w3schools, stackOverflow, MDN Web Docs.
 */
import java.util.Scanner;

public class SlopeLab
{

   private static Scanner console = new Scanner (System.in);

   public static void main(String[] args)
   {
      //get coords of points
      System.out.print("Enter the coordinates of point 1 (x, y): ");
      int xval1 = console.nextInt();
      int yval1 = console.nextInt();
      System.out.print("Enter the coordinates of point 2 (x, y): ");
      int xval2 = console.nextInt();
      int yval2 = console.nextInt();

      slopeCalc(xval1, xval2, yval1, yval2);

   }

   public static void slopeCalc(int x1, int x2, int y1, int y2)
   {

      if ( x1 == x2 )
      {
         // Check for vertical line
         System.out.println("Alert! The Line is Vertical!");
         System.out.println("Equation of the line: x = " + x1);
      }
      else if ( y1 == y2 )
      {
         //check for horizontal line
         System.out.println("Alert! The Line is Horizontal!");
         System.out.println("Equation of the line: y = " + y1);
      }
      else
      {
         // if line is not vertical or horizontal, show equation of the line
         double slope = (double)(y2 - y1) / (x2 - x1);
         double intercept = (double)y1 - x1 * slope;
         System.out.println("Equation of the line: y = " + slope + "x + " + intercept);
      }

   }

}
