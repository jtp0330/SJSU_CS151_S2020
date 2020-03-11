package A5;

public class Course {
	
	private String name;
	private String description;
	private String department;
	private String start;
	private String day;
	
	public Course(String name, String description, String department, String start, String day) {
		this.name = name;
		this.description = description;
		this.department = department;
		this.start = start;
		this.day = day; 
	}
	
	public void setName(String n) {
		
		name = n;
	}
	public String getName() {
		
		return name;
	}
	
	public void setDescription(String d) {
		
		description = d;
		
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public void setDeparment(String d) {
		
		department = d;
		
	}
	
	public String getDepartment() {
		
		return department;
		
	}
	
	public void setStart(String s) {
		
		start = s;
		
	}
	
	public String getStart() {
		
		return start;
		
	}
	
	public void setDay(String d) {
		
		day = d;
		
	}
	
	public String getDay() {
		
		return day;
		
	}
	
	public String toString() {
		
		return name + " " + ", " + description + " offered by the " + department + " and starts at " + start + " at " + day + ".";
	}
	
	

}
