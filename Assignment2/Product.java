package Assignment2;

public final class Product {
	
	private final String name;
	private final String description;
	private final double price;
	private final int maxquantity;
	
	public Product(String name, String description, double price, int maxquantity) {
		
			this.name = name;
			this.description = description;
			this.price = price;
			this.maxquantity = maxquantity;
	}
	
	public final String toString(int max) {
		
		
		
		return "Product: " + name + "\n" + "Description: " + description + "\n" + "Price: $" + price + "\n" + "Max Quantity: " + max;
		
		
	}
	

}
