public class DrugPotency
{
   public static void main(String[] args)
   {
      int month = 0;
      double effectiveness = 100.0;

      while (effectiveness > 49)
      {
         System.out.println("Month: " + month + "    " + "effectiveness: " + effectiveness);
         effectiveness *= 0.96;
         month++;
      }
      System.out.println("DISCARDED");
   }
}
