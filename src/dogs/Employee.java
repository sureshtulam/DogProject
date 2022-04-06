package dogs;

public class Employee {
	private String fname;
	private String  lname;
	int SSN;
	public Employee(String fname, String lname, int sSN) {
		super();
		this.fname = fname;
		this.lname = lname;
		SSN = sSN;
		System.out.println("inside employee constructor");
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	public String getFullName() {
		System.out.println("inside employee getfull name");
		return fname+ " "+lname;
	}
	@Override
	public String toString() {
		System.out.println("inside employee to string");
		return SSN+" "+getFullName();
	}
	
	
	

}
