package a6;

import java.util.LinkedList;
import java.util.TreeSet;

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
	private LinkedList<Course> courses;
	
	public Student(String first, String last, int age, float GPA, String major,
			String department, Course c1, Course c2, LinkedList<Course> course) {
		
		this.first = first;
		this.last = last;
		this.age = age;
		this.GPA = GPA;
		this.major = major;
		this.department = department;
		this.c1 = new Course("CS 149", "Computer Science", "Science Department", 7, "Tuesday and Thursday");
		this.c2 = new Course("GEOL 4L", "Earth's Natural Processes", "Geology Department", 9, "Monday");
		
		LinkedList<Course> courses = course;
		
		
	}
	
	public void addCourse(Course c)
	{
		courses.addLast(c);
	}
	
	public void removeCourse(int location)
	{
		courses.remove(location);
	}
	//sort strings
	public void sortCourse(boolean isDescend, boolean isName, boolean isDepartment, boolean isWeekday)
	{
		TreeSet<String> strsorted = new TreeSet<String>();
		LinkedList<Course> result = new LinkedList<Course>();
		
		
		if(!isDescend) 
		{
			if(isName) {
				for(int i = 0; i < courses.size(); i++)
					strsorted.add(courses.get(i).getName());
				for(String s: strsorted) {
					for(int j = 0; j < courses.size(); j++) {
						if(s.equals(courses.get(j).getName()))
							result.add(courses.get(j));
					}
				}
				System.out.println(result);
			}else if(isDepartment) {
				for(int i = 0; i < courses.size(); i++)
					strsorted.add(courses.get(i).getDepartment());
				for(String s: strsorted) {
					for(int j = 0; j < courses.size(); j++) {
						if(s.equals(courses.get(j).getDepartment()))
							result.add(courses.get(j));
					}
				}
				System.out.println(result);
			}else if(isWeekday) {
				for(int i = 0; i < courses.size(); i++)
					strsorted.add(courses.get(i).getWeekday());
				for(String s: strsorted) {
					for(int j = 0; j < courses.size(); j++) {
						if(s.equals(courses.get(j).getWeekday()))
							result.add(courses.get(j));
					}
				}
				System.out.println(result);
			}
			
			
		}
		else {
			if(isName) {
				for(int i = 0; i < courses.size(); i++)
					strsorted.add(courses.get(i).getName());
				for(String s: strsorted) {
					for(int j = courses.size(); j > 0; j--) {
						if(s.equals(courses.get(j).getName()))
							result.add(j, courses.get(j));
					}
				}
				System.out.println(result);
			}else if(isDepartment) {
				for(int i = 0; i < courses.size(); i++)
					strsorted.add(courses.get(i).getDepartment());
				for(String s: strsorted) {
					for(int j = courses.size(); j > 0; j--) {
						if(s.equals(courses.get(j).getDepartment()))
							result.add(j, courses.get(j));
					}
				}
				System.out.println(result);
			}else if(isWeekday) {
				for(int i = 0; i < courses.size(); i++)
					strsorted.add(courses.get(i).getWeekday());
				for(String s: strsorted) {
					for(int j = courses.size(); j > 0; j--) {
						if(s.equals(courses.get(j).getWeekday()))
							result.add(j, courses.get(j));
					}
				}
				System.out.println(result);
			}
			
			
		}
			
		
	}
	public void sortCourse(boolean isDescend, int age)
	{
		TreeSet<Integer> intsorted = new TreeSet<Integer>();
		LinkedList<Course> result = new LinkedList<Course>();
		
		if(!isDescend)
		{
			for(int i = 0; i < courses.size(); i++)
				intsorted.add(courses.get(i).getStarttime());
			for(int time: intsorted) {
				for(int j = 0; j < courses.size(); j++) {
					if(time == courses.get(j).getStarttime())
						result.add(courses.get(j));
				}		
			}
			System.out.println(result);
		}
		else {
			for(int i = 0; i < courses.size(); i++)
				intsorted.add(courses.get(i).getStarttime());
			for(int time: intsorted) {
				for(int j = courses.size(); j > 0; j--) {
					if(time == courses.get(j).getStarttime())
						result.add(j, courses.get(j));
				}		
			}
			System.out.println(result);
		}
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
	
}
