class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
  }
} 

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = scanner.nextInt();

        // Calculate days, hours, and remaining minutes
        int days = totalMinutes / (24 * 60);
        int remainingHours = (totalMinutes % (24 * 60)) / 60;
        int remainingMinutes = totalMinutes % 60;

        // Display the result
        System.out.println(totalMinutes + " minutes = " + days + " days, " + remainingHours + " hours, and " + remainingMinutes + " minutes");

        // Close the scanner
        scanner.close();
    }
}
