class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
  }
} 
import java.util.Scanner;

public class Rads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the degree measure
        System.out.print("Enter the degree measure: ");
        double degrees = scanner.nextDouble();

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Display the result
        System.out.println(degrees + " degrees is equal to " + radians + " radians.");

        // Close the scanner
        scanner.close();
    }
}
