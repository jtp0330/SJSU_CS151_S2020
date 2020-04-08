package a6;

import java.util.ArrayList;
import java.util.TreeSet;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Joe", "Smith", 40);
		Person p2 = new Person("Amy", "Gold", 32);
		Person p3 = new Person("Tony", "Stork", 21);
		Person p4 = new Person("Sean", "Irish", 24);
		Person p5 = new Person("Tina", "Brock", 28);
		Person p6 = new Person("Lenny", "Hep", 18);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		//sorting 
		ArrayList<Person> AgeAscend = new ArrayList<Person>();
		ArrayList<Person> AgeDescend = new ArrayList<Person>();
		ArrayList<Person> FirstAscend = new ArrayList<Person>();
		ArrayList<Person> FirstDescend = new ArrayList<Person>();
		ArrayList<Person> LastAscend = new ArrayList<Person>();
		ArrayList<Person> LastDescend = new ArrayList<Person>();
		
		
		Person lowest = people.get(0);
		int limit = 0;
		
		for(int i = 0; i < people.size(); i++) {
			for(int j = 0; j < people.size(); j++) {
				if(lowest.getAge() > people.get(j).getAge() && limit < people.get(j).getAge())
					lowest = people.get(j);
			}
		AgeAscend.add(lowest);	
		limit = lowest.getAge();
		lowest = people.get(0);
		}
		
	
		//sort descend age
		
		for(int i = AgeAscend.size()-1; i >= 0; i--)
			AgeDescend.add(AgeAscend.get(i));
		
	
		//sort ascend first name
		
		TreeSet<String> sorted = new TreeSet<String>();
		
		
		for(int i = 0; i < people.size(); i++)
			sorted.add(people.get(i).getFirst());
		
		for(String s: sorted) {
			for(int j = 0; j < people.size(); j++) {
				if(s.equals(people.get(j).getFirst()))
					FirstAscend.add(people.get(j));
			}
		}
		
		//sort descend name
		
		for(int i = FirstAscend.size()-1; i>=0; i--)
			FirstDescend.add(FirstAscend.get(i));	
		
		
		TreeSet<String> sorted2 = new TreeSet<String>();
		//sort last ascend
		
		for(int i = 0; i < people.size(); i++)
			sorted2.add(people.get(i).getLast());
		
		for(String s1: sorted2) {
			for(int j = 0; j < people.size(); j++) {
				if(s1.equals(people.get(j).getLast()))
					LastAscend.add(people.get(j));
			}
		}
		
	//sort last descend
		
	for(int i = LastAscend.size()-1; i>=0; i--)
		LastDescend.add(LastAscend.get(i));
	
		System.out.println(AgeAscend);
		System.out.println(AgeDescend);
		System.out.println(FirstAscend);
		System.out.println(FirstDescend);
		System.out.println(LastAscend);
		System.out.println(LastDescend);
		
		
		
	}

}
