import java.util.Scanner;

class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference
        double circumference = 2 * Math.PI * radius;

        // Display the result
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);

        // Close the scanner
        scanner.close();
    }
}

  }
}