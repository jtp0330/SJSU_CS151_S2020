package a3;

public class Employee extends Person {
	
	private int ID;

	public Employee(String first, String last, int age, int ssnum, Address address, String education, boolean disabled, int ID) {
		super(first, last, age, ssnum, address, education, disabled);
		this.ID = ID;
		
	}
	public void setID(int I) {
		
		ID = I;
		
	}
	
	public int getID() {
		
		return ID;
		
	}
	
	public String toString() {
		
		return super.toString() + ",  ID: " + ID;
		
	}
}
