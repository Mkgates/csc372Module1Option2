package csc372Module1Option2;

public class Manager extends Employee{
	private String department;
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + department);
	}

}
