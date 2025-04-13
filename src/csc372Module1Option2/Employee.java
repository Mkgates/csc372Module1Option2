package csc372Module1Option2;

/**
 * Represents and employee class with basic info
 */

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	/**
	 * Default constructor
	 * Sets salary to 0
	 */
	
	public Employee() {
		this.salary= 0;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	/**
	 * Prints a summary of employee info
	 */
	
	public void employeeSummary() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Salary: $" + salary );
	}

}
