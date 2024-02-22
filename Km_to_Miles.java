
class Km_to_Miles extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
  }
}
import java.util.Scanner;

public class Km_to_Miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println("The distance in miles is: " + miles);

        // Close the scanner
        scanner.close();
    }
}
