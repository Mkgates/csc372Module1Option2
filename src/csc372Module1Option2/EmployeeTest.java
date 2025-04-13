package csc372Module1Option2;

/**
 * Tests employee and manager classes
 */

public class EmployeeTest {
	
	/**
	 * Main method to run tests
	 */

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Bradley");
		emp1.setLastName("Padia");
		emp1.setEmployeeID(12321);
		System.out.println("Employee Details");
		emp1.employeeSummary();
		System.out.println();
		
		
		Manager mgr1 = new Manager();
		mgr1.setFirstName("Brayleigh");
		mgr1.setLastName("Gates");
		mgr1.setEmployeeID(102717);
		mgr1.setDepartment("Security");
		System.out.println("Manger Details:");
		mgr1.employeeSummary();
	}

}
