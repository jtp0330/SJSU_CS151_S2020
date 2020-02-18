package Assignment2;

public class EmployeeTest {

		public static void main(String[] args) {
			
			Person p = new Person("John", "Smith", 23, 320, "145, Jack Avenue", "Male", 150.0f);
			Employee e = new Employee(012543, "contractor", 30, 60.0);
			
			e.introduce();
			System.out.println();
			
			Person p1 = new Person("Lisa", "Gray", 22, 124, "123 S Street", "Female", 126.0f);
			Employee e1 = new Employee(0135343, "full time employee", 2, 110000.0);
			
			e1.introduce();
			System.out.println();
			
			Person p2 = new Person("Timothy", "Briggs", 29, 221, "543 N Street", "Male", 200.0f);
			Employee e2 = new Employee(014540, "full time employee", 4, 80000.0);
			
			e2.introduce();
			System.out.println();
			
			Person p3 = new Person("George", "Wallace", 30, 222, "420 Blazit Hill", "Male", 111.0f);
			Employee e3 = new Employee(13245, "part time employee", 25, 20.0);
			
			e3.introduce();
			System.out.println();
			
			Person p4 = new Person("Amy", "Student", 41, 321, "432 BigGuy Parkway", "Female", 96.0f);
			Employee e4 = new Employee(24321, "contractor", 45, 45);
			
			e4.introduce();
			System.out.println();
		}
}
