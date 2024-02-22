class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
  }
} 

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the base (a)
        System.out.print("Enter the base (a): ");
        double base = scanner.nextDouble();

        // Prompt user to enter the exponent (b)
        System.out.print("Enter the exponent (b): ");
        double exponent = scanner.nextDouble();

        // Calculate the result of a^b
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
