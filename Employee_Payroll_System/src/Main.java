
public class Main {

	public static void main(String[] args) {
		PayrollSystem system = new PayrollSystem();
		
		FullTime_Employee femp = new FullTime_Employee(1, "Kiran", 39000);
		PartTime_Employee pemp = new PartTime_Employee(2, "Bhaiyya", 8, 400);
		
		system.addEmployee(femp);
		system.addEmployee(pemp);
		
		system.displayEmployees();
		
		system.deleteEmployee(1);
		
		FullTime_Employee femp2 = new FullTime_Employee(4, "Vivek", 39000);
		system.addEmployee(femp2);
		
		system.displayEmployees();
	}

}
