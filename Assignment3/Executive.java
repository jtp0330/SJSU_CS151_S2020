package a3;

public class Executive extends Employee {

	
	private float yearlysalary;
	private float yearlybonus;
	
	public Executive(String first, String last, int age, int ssnum, Address address, String education, boolean disabled, int ID, float yearlysalary, float yearlybonus) {
		super(first, last, age, ssnum, address, education, disabled, ID);
		this.yearlysalary = yearlysalary;
		this.yearlybonus = yearlybonus;
	}
	
	public void setYearlySalary(float ys) {
		
		yearlysalary = ys;
		
	}
	
	public float getYearlySalary() {
		
		return yearlysalary;
	}
	
	public void setYearlyBonus(float yb) {
		
		yearlybonus = yb;
		
	}
	
	public float getYearlyBonus() {
		
		return yearlybonus;
		
	}
	public float computePay() {
		
		return yearlysalary + yearlybonus;
	}
	
	public String toString() {
		
		String s = super.toString() + " Position: Executive" + "Yearly Salary: " + yearlysalary + ", Yearly Bonus:  " + yearlybonus;
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
