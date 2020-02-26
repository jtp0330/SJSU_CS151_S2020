package a3;

public class FullTimeHourlyEmployee extends Employee {

	private float hourpay;
	private float overtimepay;
	
	public FullTimeHourlyEmployee(String first, String last, int age, int ssnum, Address address, String education, boolean disabled, int ID, float hourpay, float overtimepay) {
		super(first, last, age, ssnum, address, education, disabled, ID);
		this.hourpay = hourpay;
		this.overtimepay = overtimepay;
		
	}
	
	public void setHourpay(float hp) {
		
		hourpay = hp;
		
	}
	
	public float getHourpay() {
		
		return hourpay;
		
	}
	
	public void setOvertimepay(float op) {
		
		overtimepay = op;
		
	}
	
	public float getOvertiempay() {
		
		return overtimepay;
		
	}
	
	public float computePay(int hours) {
		
		return (hourpay * hours) + overtimepay;
	}
	
	public String toString() {
		String s = super.toString() + " Position: Full Time Hourly Employee, " + "Hourly Pay: " + hourpay + ", Overtime Pay: " + overtimepay;
		return s;
	}
	
	public void introduce() {
		
		System.out.println(this.toString());
		
	}
	
	public void introduce(boolean socialsecurity) {
		
		if(socialsecurity == true)
			System.out.println(this.toString() +  ", Social Security: " + this.getSsnum());
		else
			System.out.println(this.toString());
	}
	
}
