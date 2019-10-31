public class TaxBracket {

   public static void main(String[] args) {

      int salary = 7159;

      System.out.println(tax(salary));

   }

   public static double tax (double salary)
   {

      if (salary > 0 && salary <= 7150)
      {
         double rate = 0.90;
         salary *= rate;
      } else if (salary <= 29050)
      {
         int flatRate = 715;
         double rate = 0.85;

         salary = (salary - 7150 - flatRate);
         salary = salary * rate;
      }

      return salary;

   }
}
