import java.util.Scanner;

public class Rectangle
{
    public static void main (String [] args)
    {
        Scanner console = new Scanner (System.in);
        int width, length;
        int area, perimeter;

        // Take user input for width and length
        System.out.println("Enter the Length: ");
        length = console.nextInt();
        System.out.println("Enter the Width: ");
        width = console.nextInt();

        // Calculate area and perimeter
        area = width * length;
        perimeter = 2 * (length * width);

        // Print out results
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);

    }
}


