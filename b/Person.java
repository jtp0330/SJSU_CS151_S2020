package a6;

public class Person {
	private String first;
	private String last;
	private int age;
	
	public Person(String first, String last, int age)
	{
		this.first = first;
		this.last = last;
		this.age = age;
		
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
public String toString() {
		
		return "Name: " + first + " " + last + ", " + "Age: " + age;
				
	}
}
