package A5;

public class Employee  {
	
	private String first;
	private String last;
	private int ID;
	private float hourlypay;

	public Employee(String first, String last, int ID, float hourlypay) {
		
		this.first = first;
		this.last = last;
		this.ID = ID;
		this.hourlypay = hourlypay;
		
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
	
	public void setID(int I) {
		
		ID = I;
		
	}
	
	public int getID() {
		
		return ID;
		
	}
	
	public void setHourlyPay(float h) {
		
		hourlypay = h;
	}
	
	public float getHourlyPay() {
		
		return hourlypay;
		
	}
	
	public float computePay(int hours) throws NumberFormatException {
		
		float pay = 0;
		
		try {	
			if(hours < 0)
				throw new NumberFormatException("Invalid Input!");
			else if(hours > 40)
				throw new TooManyHoursWorkedException("Too many hours worked!");
			else 
				pay = hourlypay * hours;
			
		}catch(Exception e) {
		
			e.printStackTrace();
		
		}
		return pay;
	
		
	}
	
	
		
	
}
