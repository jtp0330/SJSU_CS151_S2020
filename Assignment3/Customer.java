package a3;

public class Customer extends Person {
	
	private String paymethod;
	private boolean ddeposit;
	
	public Customer(String first, String last, int age, int ssnum, Address address, String education, boolean disabled, String paymethod, boolean ddeposit) {
		super(first, last, age, ssnum, address, education, disabled);
		this.paymethod = paymethod;
		this.ddeposit = ddeposit;
	}
	public void setPaymethod(String pmet) {
		
		paymethod = pmet;
		
	}
	
	public String getPaymethod() {
		
		return paymethod;
		
	}
	
	public void setDdeposit(boolean dd) {
		
		ddeposit = dd;
		
	}
	
	public boolean getDdeposit() {
		
		return ddeposit;
	}
	
	public void makePayment() {
		
		System.out.println(getFirst() + " " + getLast() + " prefers to pay with: " + paymethod);
	}
	
	public String toString() {
		String s = super.toString()+ " Position: Customer, " + "Paymethod used: " + paymethod + ", Direct Deposit: " + ddeposit;
		return s;
	}
	
	public void introduce(boolean socialsecurity) {
		
		if(socialsecurity == true)
			System.out.println(this.toString() +  ", Social Security: " + this.getSsnum());
		else
			System.out.println(this.toString());
	}
	
	public void introduce(boolean socialsecurity, boolean payinfo) {
		if(socialsecurity == true && payinfo == true) {
			System.out.println(this.toString() + ", Social Security:" +  getSsnum() + ", Pay Method: " + getPaymethod());
		}
	}
}
