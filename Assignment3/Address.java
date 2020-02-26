package a3;

public class Address {
	
	private int num;
	private String street;
	private String city;
	private int zip;
	private String state;

	public Address() {
		
		this.num = num;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	public Address(int num, String street, String city, int zip, String state) {

		this.num = num;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}

	public void setNum(int n) {

		num = n;
	}

	public int getNum() {

		return num;

	}

	public void setStreet(String strt) {

		street = strt;
	}

	public String getStreet() {

		return street;

	}

	public void setCity(String cit) {

		city = cit;
	}

	public String getCity() {

		return city;

	}

	public void setZip(int z) {

		zip = z;
	}

	public int getZip() {

		return zip;
	}

	public void setState(String stat) {

		state = stat;
	}

	public String getState() {

		return state;
	}

	public String toString() {

		return num + " " + street + ", " + city + ", " + state + " " + zip;
	}

}
