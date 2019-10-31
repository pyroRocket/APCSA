import java.util.Scanner;

public class CombinationLock
{

   private static Scanner console = new Scanner (System.in);

   public static void main(String[] args) {
      int first, second, third;

      first = (int)(Math.random() * 50 + 1);
      second = (int)(Math.random() * 50 + 1);
      third = (int)(Math.random() * 50 + 1);

      System.out.println(first + ", " + second + ", " + third);

      lockIsOpen(first, second, third);
   }

   public static boolean lockIsOpen (int firstNum, int secondNum, int thirdNum)
   {

      System.out.println("Enter the three numbers. Separate each number with a space:");
      int userCombo = console.nextInt();
      int userCombo2 = console.nextInt();
      int userCombo3 = console.nextInt();

      if (userCombo == firstNum && userCombo2 == secondNum && userCombo3 == thirdNum)
      {
         System.out.println("The lock is open");
         return true;
      }
      else
      {
         System.out.println("The combination is wrong. The lock remains closed.");
         return false;
      }


   }
}
