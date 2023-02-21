import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

       double l,b;
       System.out.print("Please provide length of rectangle: ");
       l = scanner.nextDouble();
       System.out.print("Please provide base (width) of rectangle: ");
       b = scanner.nextDouble();

       if(l < 0 || b < 0)
           System.out.println("Error: Values can only be positive");
       else
       {
           System.out.println("The perimeter of the rectangle is: " + (2*(l+b)) +" unit ");
           System.out.println("The area of the rectangle is: " + l*b + " unit squared ");
           System.out.println("The diagonal of the rectangle is: " + (Math.sqrt(Math.pow(l,2))) + (Math.pow(b,2)) + " unit ");
       }

    }
}
