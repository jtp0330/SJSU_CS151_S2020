package a7;

import java.util.ArrayList;

public class MethodTest {
	
	private static <T> int count(ArrayList<T> ar)
	{
		int count = 0;
		
		for(T e : ar)
			count++;
		return count;
		
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<Double> a3 = new ArrayList<Double>();
		
		a1.add(0);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		
		a2.add("Bob");
		a2.add("Sophie");
		a2.add("Amy");
		a2.add("Rai");
		a2.add("Finn");
		
		a3.add(0.5);
		a3.add(1.2);
		a3.add(2.4);
		a3.add(3.1);
		a3.add(4.6);
		a3.add(5.9);
		a3.add(6.0);
		a3.add(7.9);
		a3.add(8.7);
		
		System.out.println("List 1 Count: " + count(a1));
		System.out.println("List 2 Count: " + count(a2)); 
		System.out.println("List 3 Count: " + count(a3));
		
	}
	
	
}
