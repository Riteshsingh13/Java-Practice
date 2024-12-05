
public abstract class Employee {
	private int ID;
	private String name;
	
	public Employee(int id, String name) {
		this.ID = id;
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double calculateSalary(); 
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + ID + ", salary=" + calculateSalary() + "]";
	}

}
