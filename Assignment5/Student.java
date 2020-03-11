package A5;

public class Student {

	private String first;
	private String last;
	private int age;
	private float GPA;
	private String major;
	private String department;
	private Course c1;
	private Course c2;
	private Course c3;
	private Course c4;
	
	public Student(String first, String last, int age, float GPA, String major, String department) {
		
		this.first = first;
		this.last = last;
		this.age = age;
		this.GPA = GPA;
		this.major = major;
		this.department = department;
		c1 = new Course("CS 147", "Computer Architecture", "Science Department", "7:30 pm", "Tuesday and Thursday");
		c2 = new Course("GEOL 4L", "Earth's Natural Processes", "Geology Department", "9:00 am", "Monday");
		c3 = new Course("COMM 20", "Public Speaking", "Communication Department", "10:30 am", "Monday");
		c4 = new Course("MATH 129A", "Linear Algebra", "Mathematics Department", "12:00 pm", "Monday and Wednesday");
		
		
	}
	
	public void setFirst(String f) {
		
		first = f;
		
	}
	
	public String getFirst() {
		
		return first;
		
	}
	
	public void setLast(String l) {
		
		last = l;
		
	}
	
	public String getLast() {
		
		return last;
		
	}
	
	public void setAge(int a) {
		
		age = a;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setGPA(float g) {
		
		GPA = g;
		
	}
	
	public float getGPA() {
		
		return GPA;
		
	}
	
	public void setMajor(String m) {
		
		major = m;
		
	}
	
	public String getMajor() {
		
		return major;
		
	}
	
	public void setDepartment(String d) {
		
		department = d;
		
	}
	
	public String getDepartment() {
		
		return department;
		
	}
	
	public void printInfo() {
		
		System.out.println("This is a " + age + " year old person named " + first + " " + last + " who is a " + major + " major with a GPA of " + GPA + " and belongs at the " + department + ".");
		System.out.println("They are currently taking: " + c1 + "\n" + c2 + "\n" + c3 + "\n" + c4);
	}
	

}
