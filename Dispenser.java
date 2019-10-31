import java.util.Scanner;

public class Dispenser
{
   public static void main (String[] args)
   {
      System.out.print("Enter price of item (in cents): ");
      Scanner console = new Scanner (System.in);
      int cost = console.nextInt();

      System.out.println("You bought an item for " + cost + "cent(s) and gave me a dollar so your change is: \n");


      int change = 100 - cost;
      int quarters = change / 25;
      int dimes = change % 25 / 10;
      int nickels = change % 25 % 10 / 5;
      int pennies = change % 25 % 10 % 5 / 1;

      System.out.println(quarters + " Quarter(s), " + dimes + " Dime(s), " + nickels + " Nickel(s)" + pennies + " Penny(ies)");


   } //main
} //Dispenser


// Future changes: print message if 0 is entered and try again
