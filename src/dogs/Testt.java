package dogs;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("john", "Doe", 9876);
		System.out.println(emp);
		System.out.println("-----------------------------");
		HourlyEmployee hrs=new HourlyEmployee("Jane", "Ranch", 5678, 10, 10.0);
		System.out.println(hrs);
		System.out.println("--------------------------------");

	}

}
