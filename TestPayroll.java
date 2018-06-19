package ch06Lab2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**This program asks the user to enter data for an
* employee then takes hours worked and pay rate
* and outputs gross pay. Also adjusts pay to OT
* when working certain amount of hours.
* @author Trevor Deligne
* 2014-11-05
*/
public class TestPayroll
{
  /**
  * This method runs the test program
  * 
  * @param args ignored
  */
  public static void main(String[] args)
  {
    String testName;                // to hold employees name
    String testID;                  // to hold employees ID
    double testPayRate;             // to hold employees Pay rate
    double testHours;               // to hold employees Hours worked
    
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Get the name
    System.out.print("Enter the name: ");
    testName = keyboard.nextLine();
    
    // Get ID number
    System.out.print("Enter the ID number: ");
    testID = keyboard.nextLine();
    
    
    // Create an instance of the Payroll class,
    // passing the data that was entered as arguments
    // to the constructor.
    Payroll payroll = new Payroll(testName, testID);
    
    // Set the rate of pay
    System.out.print("Enter the rate of pay: ");
    testPayRate = keyboard.nextDouble();
    payroll.setHourlyPayRate(testPayRate);
    
    // Set the number of hours worked
    System.out.print("Enter the number of hours worked: ");
    testHours = keyboard.nextDouble();
    payroll.setHoursWorked(testHours);
    
    // Create a DecimalFormat object for displaying gross pay.
    DecimalFormat dollar = new DecimalFormat("$#,###.00");
    
    // Get the data from payroll and display gross pay
    System.out.println();
    System.out.println("Employee ID: " + payroll.getIdNumber() 
                      + "\nEmployee Name: " + payroll.getName() 
                      + "\nGross pay: " + dollar.format(payroll.getGrossPay()));
    
    keyboard.close();
    System.exit(0);

   
  }
}
