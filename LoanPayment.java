import java.util.Scanner;
import java.text.DecimalFormat;

public class LoanPayment
{
   //Scanner console
   private static Scanner console = new Scanner (System.in);

   public static void main (String [] args)
   {
      int years;
      double amount, rate, payment;
      amount = getAmount();
      rate = getRate();
      years = getYears();
      payment = findPayment(amount, rate, years);

     displayPayment (payment);
   }

   public static double getAmount()
   {
      System.out.print("Enter the amount to be borrowed: ");
      double amount = console.nextDouble();
      if (amount <= 0 || amount > 100000)
      {
         System.out.print("invalid. Enter Amount:");
         amount = console.nextDouble();
      }
      return amount;
   }

   public static double getRate()
   {
      System.out.print("Enter the annual interest rate as a percent: ");
      double annualRate = console.nextDouble();
      if (annualRate <= 0.0)
      {
         System.out.print("Invalid input! Enter the annual interest rate as a percent: ");
         annualRate = console.nextInt();
      }
      return annualRate / 100.0 / 12.0;

   }

   public static int getYears()
   {
      System.out.print("Enter the length of the loan in years: ");
      int years = console.nextInt();
      if (years <= 0)
      {
         System.out.print("Invalid input! Enter the length of the loan in years: ");
         years = console.nextInt();
      }
      return years;
   }

   public static double findPayment(double amount, double rate, int years)
   {
      double payment = amount * rate * (Math.pow(rate + 1, years*12)) / (Math.pow(rate + 1, years*12) - 1);
      return payment;
   }

   public static void displayPayment(double payment)
   {
      DecimalFormat d = new DecimalFormat("0.00");
      System.out.println("Monthly payment: $" + d.format(payment));
   }


}
