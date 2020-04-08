package a6;

public class Course {
	private String name;
	private String description;
	private String department;
	private int starttime;
	private String weekday;
	
	public Course(String name, String description, String department, int starttime, String weekday)
	{
		this.name = name;
		this.description = description;
		this.department = department;
		this.starttime = starttime;
		this.weekday = weekday;
	}
	
	public void setName(String n)
	{
		name = n;
		
	}
	
	public String getName()
	{
		return name;
	}
	public void setDescription(String d)
	{
		description = d;
		
	}
	public String getDescription()
	{
		return description;
	}
	public void setDepartment(String d)
	{
		department = d;
		
	}
	
	public String getDepartment()
	{
		return department;
		
	}
	
	public void setStarttime(int s)
	{
		starttime = s;
		
	}
	
	public int getStarttime()
	{
		return starttime;
		
	}
	
	public void setWeekday(String w)
	{
		weekday = w;
		
	}
	
	public String getWeekday()
	{
		return weekday;
		
	}
	public String toString()
	{
		return "Name: " + name + ", Description: " + description + ", Department: " 
				+ department + ", Starttime: " + starttime + ", Weekday: " + weekday;
	}
}
