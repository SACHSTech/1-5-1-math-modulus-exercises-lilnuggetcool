class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
  }
} 

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of hours
        System.out.print("Enter the number of hours: ");
        int totalHours = scanner.nextInt();

        // Calculate days and remaining hours
        int days = totalHours / 24;
        int remainingHours = totalHours % 24;

        // Display the result
        System.out.println(totalHours + " hours = " + days + " days and " + remainingHours + " hours");

        // Close the scanner
        scanner.close();
    }
}
