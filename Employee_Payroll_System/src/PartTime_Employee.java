
public class PartTime_Employee extends Employee {

	private double hourlyRate;
	private int hoursWork;
	
	public PartTime_Employee(int id, String name, int hoursWork, double hourlyRate) {
		super(id, name);
		this.hoursWork = hoursWork;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return hoursWork*hourlyRate*30;
	}

}
