package Assignment2;


public class StudentTest {
	
	public static void main(String[] args) {
		
			Student stud = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science department");
			Student.Course c = stud.new Course();
			c.printSchedule();
			
	}
}
