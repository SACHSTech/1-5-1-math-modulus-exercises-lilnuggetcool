class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
    import java.util.Scanner;

    public class AreaSin {
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
    
            // Calculate the area of the triangle using the sine law
            double area = 0.5 * a * b * Math.sin(angleInRadians);
    
            // Display the result
            System.out.println("The area of the triangle is: " + area);
    
            // Close the scanner
            scanner.close();
        }
    }
    
