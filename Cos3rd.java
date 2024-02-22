class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
  }
} 

import java.util.Scanner;

public class Cos3rd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        // Prompt user to enter the angle in degrees
        System.out.print("Enter the angle between sides a and b in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        // Convert angle from degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculate the third side using the cosine law
        double thirdSide = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(angleInRadians));

        // Display the result
        System.out.println("The length of the third side is: " + thirdSide);

        // Close the scanner
        scanner.close();
    }
}
