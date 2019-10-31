public class Division {

   public static void main(String[] args)
   {
      int num1 = 8;
      int num2 = 4;

      if (num1 > num2)
      {
         if (num2 > 0)
         {
            System.out.println(num1 / num2 + "r" + num1 % num2);
         }
         else
         {
            System.out.println("This division is invalid");
            return;
         }

      }
      else if (num1 < num2)
      {
         if (num2 > 0)
         {
            System.out.println(num2 / num1 + "r" + num2 % num1);
         }
         else
         {
            System.out.println("This division is invalid");
            return;
         }
      }
      else
      {
         System.out.println("The numbers you have entered are equal");
      }
   }
}
