package csc372Module1Option2;

/**
 * Represents a manager, an extension of employee with a department
 */

public class Manager extends Employee{
	private String department;
	
	/**
	 * Sets the manager's department
	 */
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Prints a summary of manager's info
	 */
	
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + department);
	}

}
