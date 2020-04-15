package a6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListManipulator {

	private ArrayList<Integer> myLst;
	
	public ListManipulator(ArrayList<Integer> myLst)
	{
		this.myLst = myLst;
	}
	
	public ArrayList<Integer> sort(ArrayList<Integer> arr) 
	{
		TreeSet sorted = new TreeSet(arr);
		ArrayList<Integer> result = new ArrayList<Integer>(sorted);
		
		return result;
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> arr)
	{
		int switchtemp = arr.get(0);
		
		arr.set(0, arr.get(arr.size() - 1));
		arr.set(arr.size()-1, switchtemp);
		
		return arr;	
		
	}
	
	public void table(ArrayList<Integer> arr)
	{
		int value = 5;
		HashMap<Integer, Integer> name = new HashMap<Integer, Integer>(); 
		
		for(int i = 0; i < arr.size(); i++) {
			name.put(arr.get(i), value);
			value--;
		}
		
		
		TreeMap<Integer, Integer> sorted = new TreeMap<Integer, Integer>();
		
		System.out.println(name.values());
		
			
		sorted.putAll(name);
			
		
		
		System.out.println(sorted);
	}
}
