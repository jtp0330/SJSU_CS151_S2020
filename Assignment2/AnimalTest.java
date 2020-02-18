package Assignment2;

public class AnimalTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog d = new Dog("mammal", "Tim", 3, "male", "house", 10.0);
			
			Cat c = new Cat("mammal", "Luna", 2, "female", "house", 12.0);
			
			Racoon r = new Racoon("mammal", "Ken", 7, "male", "forest", 11.5);
			
			Whale w = new Whale("mammal", "Melody", 24, "female", "ocean", 6.7);
			
			d.eat();
			d.move();
			d.sound();
			d.sleep();
			d.bark();
			
			c.eat();
			c.move();
			c.sound();
			c.sleep();
			c.scratch();
			
			r.eat();
			r.move();
			r.sound();
			r.sleep();
			r.scratch();
			
			w.eat();
			w.move();
			w.sound();
			w.sleep();
			w.swim();
	}

}
