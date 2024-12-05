import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {

	private List<Employee> employeeList;
	private DbConnection db;
	
	public PayrollSystem() {
		employeeList = new ArrayList<>();
		db = new DbConnection();
	}
	
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
		db.addEmployee("Insert into emp (idemp, name, salary) value ("+emp.getID()+", "+"'"+emp.getName()+"'"+", "+emp.calculateSalary()+")");
	}
	
	public void deleteEmployee(int id) {
		for(Employee employee : employeeList) {
			if(employee.getID() == id) {
				employeeList.remove(employee);
			}
		}
		db.deleteByID("Delete from emp where idemp = "+id+"");
	}
	
	public void displayEmployees() {
		db.showAllEmp("Select * from emp");
	}
}
