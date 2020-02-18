package Assignment2;

public class Employee extends Person {
	
	private static int ID;
	private static String status;
	private static int startdate;
	private static double pay;
	
	public Employee(int ID, String status, int startdate, double pay) {
		super(first, last, age, socialsecurity, address, gender, weight);
		this.ID = ID;
		this.status = status;
		this.startdate = startdate;
		this.pay = pay;
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
	
	public void setID(int id) {
		
		ID = id;
	}
	
	public int getID() {
		
		return ID;
	}
	
	public void setStatus(String st) {
		
		status = st;
	}
	
	public String getStatus() {
		
		return status;
	}
	
	public void setStartDate(int startdate) {
		
		this.startdate = startdate;
	}
	
	public int getStartDate() {
		
		return startdate;
	}
	
	public void setPay(double pay) {
		
		this.pay = pay;
	}
	
	public double getPay() {
		
		return pay;
	}
	//calculate pay by hour
	public double calculatePay(String status, int startdate, double pay) {
		
		if(status.equals("contractor") || status.equals("part-time employee")) {
			//startdate = hours
			return pay * startdate;
		}
		else
			//168 = pay they make in an hour * number of weeks they work * hours in a week
			return pay * startdate * 168;
		
	}
	
	public String workTime(String status) {
		
		if(status.equals("contractor") || status.equals("part-time employee")) {
			return "hrs";
		}
		else
			return "yrs";
	}
	
	public String isFullTime(String status) {
		
		if(status.equals("full time employee"))
				return "weeks";
		else
			return "hours";
	}
	
public String toString() {
		
		return first + " " + last +  " a " + status + ", pay is $" + pay + "/" + workTime(status) + ", working for: " + startdate + " " + isFullTime(status) + ", Payment: $" + calculatePay(getStatus(), getStartDate(), getPay());
	}
	public void introduce() {
		
		System.out.println(this.toString());
	}
	

}
