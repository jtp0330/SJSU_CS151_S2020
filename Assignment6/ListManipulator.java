package a6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ListManipulator {

	private ArrayList<Integer> myLst;
	
	public ListManipulator(ArrayList<Integer> myLst)
	{
		this.myLst = myLst;
	}
	
	public ArrayList<Integer> sort(ArrayList<Integer> arr) 
	{
		int n = 0;
		int switchtemp = 0;
		
		for(int i = 0; i < arr.size()-1; i++) {
			if(arr.get(i) >  arr.get(i+1)) {
				switchtemp = arr.get(i);
				arr.set(n, arr.get(i+1));
				arr.set(n+1, switchtemp);
			}
			n++;
		}
		return arr;
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
		LinkedHashMap<ArrayList<Integer>, Integer> name = new LinkedHashMap<ArrayList<Integer>, Integer>(); 
		for(int i = 0; i < name.size(); i++)
			name.put(arr, arr.get(i));
		
		TreeMap<ArrayList<Integer>, Integer> sorted = new TreeMap<ArrayList<Integer>, Integer>();
		sorted.putAll(name);
		
		System.out.println(sorted);
	}
}
