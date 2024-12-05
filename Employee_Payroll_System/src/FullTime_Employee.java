
public class FullTime_Employee extends Employee {
	private double monthlySalary;

	public FullTime_Employee(int id, String name, double salary) {
		super(id, name);
		this.monthlySalary = salary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}
