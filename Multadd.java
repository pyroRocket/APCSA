public class MultAdd
{

   public static double multAdd( double a, double b, double c)
   {
      double result = a * b + c;
      System.out.println(result);
      return result;

   }

   public static void main(String[] args)
   {
      System.out.print("multAdd (1,2,3) = " + multAdd(1.0, 2.0, 3.0));
      System.out.println();
      //cosign of pi over 4
      double cosine = Math.cos(Math.PI/4.0);
      //divide cosine by 2
      double divide = 1.0/2.0;
      //sign of sine
      double sine = Math.sin(Math.PI/4.0);
      System.out.print("multAdd (sin(pi/4) + cos(pi/4)/2) = " + multAdd(cosine, divide, sine));
      System.out.println();

      double filler = 1.0;
      double log10 = Math.log(10);
      double log20 = Math.log(20);
      System.out.print("multAdd (log 10 + log 20) = " +  multAdd(filler, log10, log20));
      System.out.print("yikes(0) = ");
      yikes(0.0);
      System.out.print("yikes(1) = ");
      yikes(1.0);
   }

   // Calculates xe^-x + sqrt 1-e^-x
   public static void yikes(double x)
   {
      double yikesA = x;
      double yikesB = Math.exp(-x);
      double yikesC = Math.sqrt(1.0 - yikesB);
      multAdd(yikesA, yikesB, yikesC);
   }

}
