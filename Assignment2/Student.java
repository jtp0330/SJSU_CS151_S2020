package Assignment2;

public class Student {

	private String first;
	private String last;
	private int age;
	private float gpa;
	private String major;
	private String department;
	


	public Student(String first, String last, int age, float gpa, String major, String department) {

		this.first = first;
		this.last = last;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		
	}

	public void setFirst(String firs) {

		first = firs;
	}

	public String getFirst() {

		return first;
	}

	public void setLast(String las) {

		last = las;
	}

	public String getLast() {

		return last;
	}

	public void setAge(int ag) {

		age = ag;

	}

	public int getAge() {

		return age;

	}

	public void setGPA(float gp) {

		gpa = gp;

	}

	public float getGPA() {

		return gpa;
	}

	public void setMajor(String maj) {

		major = maj;
	}

	public String getMajor() {

		return major;
	}

	public void setDepartment(String dep) {

		department = dep;
	}

	public String getDepartment() {

		return department;
		
	}
	
	public class Course{
		 
		 
		public Course() {
			
			
		}
		public void printSchedule() {
			
			System.out.println("Name: " + getFirst() + " " + getLast() + " Age: " + getAge() + " GPA: " + getGPA() + " Major: " + getMajor() + " Deparment: " + getDepartment());
			
		}
	}
	
}
