package csc372Module1Option2;

public class EmployeeTest {

	public static void main(String[] args) {
		// Create Employee object
		Employee emp1 = new Employee();
		emp1.setFirstName("Bradley");
		emp1.setLastName("Padia");
		emp1.setEmployeeID(12321);
		System.out.println("Employee Details");
		emp1.employeeSummary();
		System.out.println();
		
		//Create Manage object
		Manager mgr1 = new Manager();
		mgr1.setFirstName("Brayleigh");
		mgr1.setLastName("Gates");
		mgr1.setEmployeeID(102717);
		mgr1.setDepartment("Security");
		System.out.println("Manger Details:");
		mgr1.employeeSummary();
	}

}
