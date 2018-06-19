package ch06Lab2;

/**
* This program uses setters, getters, and constructors
* to use information in the TestPayroll class
* @author Trevor Deligne 
* 2014-11-05
*/
public class Payroll
{
  private String name;                                // employee name
  private String idNumber;                            // employee ID number
  private double hourlyPayRate;                       // rate of pay per hour
  private double hoursWorked;                         // hours worked per week
  private static final double REGULAR_HOURS = 40.0;   // max hours before OT
  private static final double OT_MULTIPLIER = 1.5;    // overtime pay converter  
  /**
  * no arg constructor
  * uses default constructor
  */
  public Payroll()
  {
           
  }
  
  /**
  * Constructor
  * @param name The Employee's name
  * @param id The Employee's id
  */
  public Payroll(String n, String id)
  {
    name = n;
    idNumber = id;
  }
  
  /**
  * The setName method stores a value in the 
  * name field
  * @param n The value stored in name.
  */
  public void setName(String n)
  {
    name = n;
  }
  
  /**
  * getName method
  * @return The name of the employee
  */
  public String getName()
  {
    return name;
  }
  
  /**
  * The setIdNumber method stores a value in the 
  * idNumber field
  * @param id The value stored in idNumber.
  */
  public void setIdNumber(String id)
  {
    idNumber = id;
  }
  
  /**
  * getIdNumber method
  * @return The id number of the employee
  */
  public String getIdNumber()
  {
    return idNumber;
  }
  
  /**
  * The setHourlyPayRate method stores a value in the 
  * hourlyPayRate field
  * @param double rate, The value stored in hourlyPayRate.
  */
  public void setHourlyPayRate(double rate)
  {
    hourlyPayRate = rate;
  }
  
  /**
  * getHourlyPayRate method
  * @return The hourly pay rate of the employee.
  */
  public double getHourlyPayRate()
  {
    return hourlyPayRate;
  }
  
  /**
  * The setHoursWorked method stores a value in the 
  * hoursWorked field
  * @param double hours, The value stored in hoursWorked.
  */
  public void setHoursWorked(double hours)
  {
    hoursWorked = hours;
  }
  
  /**
  * getHoursWorked method
  * @return number of hours worked by employee
  */
  public double getHoursWorked()
  {
    
    return hoursWorked;
  }
  
  /**
  * getGrossPay method includes if statement 
  * used to set overtime pay converter.
  * @return number of hours worked by employee.
  */
  public double getGrossPay()
  {
    
    if(hoursWorked <= 40) 
    {
      return hoursWorked * hourlyPayRate;
    }   
    else 
    {
       return (REGULAR_HOURS * hourlyPayRate) + 
           ((hoursWorked - REGULAR_HOURS) * 
           (hourlyPayRate* OT_MULTIPLIER));
    }
      
  }
}
