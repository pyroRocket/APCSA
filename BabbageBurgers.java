import java.text.DecimalFormat;
import java.util.Scanner;

public class BabbageBurgers
{
   static Scanner console = new Scanner(System.in);
   static DecimalFormat d = new DecimalFormat("0.00");

   public static void main(String[] args) {
      final double hourly = 5.15;
      final double tax = 0.7;

      double monthlyPay = 0;
      for (int week = 1; week <= 4; week++) {
         System.out.print("How many hours did you work in week " + week + "? ");
         int hours = console.nextInt();
         double weeklyPay = (hours * hourly * tax);
         System.out.println("Your take home pay for the week is $" + d.format(weeklyPay));
         monthlyPay += weeklyPay;
      }


      System.out.println();
      System.out.println("Your total pay for the month is $" + d.format(monthlyPay));
      System.out.println("Hope you enjoyed working at Babbage Burgers.");


   }
}
