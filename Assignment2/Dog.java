package Assignment2;

public class Dog implements Domesticated {
	
	private String animaltype;
	private String name;
	private int age;
	private String gender;
	private String habitat;
	private double speed;
	
	public Dog(String animaltype, String name, int age, String gender, String habitat, double speed) {
		
		this.animaltype = animaltype;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.habitat = habitat;
		this.speed = speed;
		
	}
	
	public void setType(String animaltype) {
		
		this.animaltype = animaltype;
	}
	
	public String getType() {
		
		return animaltype;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setGender(String gender) {
		
		this.gender = gender;
	}
	
	public String getGender() {
		
		return gender;
	}
	
	public void setHabitat(String habitat) {
		
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		
		return habitat;
	}
	
	public void setSpeed(double speed) {
		
		this.speed = speed;
	}
	
	public double getSpeed() {
		
		return speed;
	}
	
	public void move() {
		
		System.out.println("Dog moves!");
	}
	
	public void sound() {
		
		System.out.println("Woof!");
	}
	
	public void eat() {
		
		System.out.println("Dog eats!");
	}
	
	public void sleep() {
		
		System.out.println("Dog sleeps!");
	}
	
	public void bark() {
		
		System.out.println("Bark!");
	}
	public String toString() {
		
		return "Type: " + animaltype + " Name: " + name + " Age: " + age + " Gender: " + " Habitat: " + " Speed: " + speed;
			
	}
}