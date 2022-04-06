package dogs;

public class HourlyEmployee extends Employee {
	private int hrsWorked;
	private double salary;
	public HourlyEmployee(String fname, String lname, int sSN, int hrsWorked, double salary) {
		super(fname, lname, sSN);
		this.hrsWorked = hrsWorked;
		this.salary = salary;
		System.out.println("inside hourly employee constructor");
	}
	
	public double calSalary() {
		System.out.println("inside hourly employee cal salary");
		return hrsWorked*salary;
	}

	@Override
	public String toString() {
		
		System.out.println("inside hourly employee to string");
		return super.toString()+ " "+calSalary();
	}
	
	
	
	

}
