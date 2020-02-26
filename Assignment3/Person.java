package a3;

public class Person {
	private String first;
	private String last;
	private int age;
	private int ssnum;
	private Address address;
	private String education;
	private boolean disabled;
	
	public Person(String first, String last, int age, int ssnum, Address address, String education, boolean disabled) {
		this.first = first;
		this.last = last;
		this.age = age;
		this.ssnum = ssnum;
		this.address = new Address();
		this.education = education;
		this.disabled = disabled;
		
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
	
	public void setSsnum(int sn) {
		
		ssnum = sn;
		
	}
	
	public int getSsnum() {
		
		return ssnum;
		
	}
	
	public void setAdress(int num, String str, String cit, int zi, String st) {
		
		address.setNum(num);
		address.setStreet(str);
		address.setCity(cit);
		address.setZip(zi);
		address.setState(st);
		
	}
	
	public Address getAdress() {
		
		return address;
		
	}
	
	public void setEducation(String edu) {
		
		education = edu;
		
	}
	
	public String getEducation() {
		
		return education;
		
	}
	
	public void setDisabled(boolean di) {
		
		disabled = di;
		
	}
	
	public boolean getDisabled() {
		
		return disabled;
		
	}
	
	public String toString() {
		
		return "Name: " + first + " " + last + ", " + "Age: " + age + ", "+ "Address: " + address.toString() + ", " + "Education: " + education + ", " + "Disabled: " + disabled;
				
	}
}
