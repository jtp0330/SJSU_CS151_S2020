package Assignment2;

public class Person {

	protected static String first;
	protected static String last;
	protected static int age;
	protected static int socialsecurity;
	protected static String address;
	protected static String gender;
	protected static float weight;

	public Person(String first, String last, int age, int socialsecurity, String address, String gender, float weight) {

		this.first = first;
		this.last = last;
		this.age = age;
		this.socialsecurity = socialsecurity;
		this.address = address;
		this.gender = gender;
		this.weight = weight;

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

	public void setSocialSecurity(int ss) {

		socialsecurity = ss;

	}

	public int getSocialSecurity() {

		return socialsecurity;

	}

	public void setAddress(String a) {

		address = a;
	}

	public String getAdddress() {

		return address;

	}

	public void setGender(String g) {

		gender = g;

	}

	public String getGender() {

		return gender;

	}

	public void setWeight(float f) {

		weight = f;
	}

	public float getWeight() {

		return weight;
	}

	public String toString() {
		
		return "Name: " + first + " " + last + " Age: " + age + " Social Security: " + socialsecurity + " Address: "+ address + " Gender: "+ gender + " Weight: " + weight;
	}
	public void introduce() {
		
		System.out.println(this.toString());
	}
	
}
