package csc372Module1Option2;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
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
	
	public void employeeSummary() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Salary: $" + salary );
	}

}
