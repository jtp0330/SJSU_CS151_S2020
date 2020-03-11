package A5;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("John", "Smith", 20, 3.6f, "Computer Science", "Science Department");
		Student s2 = new Student("Jill", "Pickle", 20, 3.7f, "Computer Science", "Science Department");
		
		s.printInfo();
		s2.printInfo();

	}

}
