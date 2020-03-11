package A5;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e = new Employee("John", "Smith", 101, 35f);
		e.computePay(40);
		e.computePay(23);
		e.computePay(1);
		e.computePay(0);
		e.computePay(-5);
		e.computePay(45);
	}
}
