package a7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Shapes<T extends Shape> implements Serializable{
	
	private ArrayList<T> shapelist;
	
	public Shapes(ArrayList<T> s) 
	{
		shapelist = s;
	}
	
	public void addShape(T s) {
		shapelist.add(s);
	}
	
	public void removeShape(int index)
	{
		shapelist.remove(index);
	}
	public void setShapeList(ArrayList<T> l)
	{
		shapelist = l;
	}
	public ArrayList<T> getShapeList()
	{
		return shapelist;
	}
	
	public Shape maxArea()
	{
		Shape max = shapelist.get(0);
		
		for(Shape s : shapelist)
		{
			if(s.computeArea() > max.computeArea())
				max = s;
		}
		
		return max;
	}
	
	public Shape minArea()
	{
		Shape min = shapelist.get(0);
		
		for(Shape s : shapelist)
		{
			if(s.computeArea() < min.computeArea())
				min = s;
		}
		
		return min;
	}
	
	public void serialList(Shape s)
	{
		try {
			for(int i = 0; i < shapelist.size(); i++)
			{
				FileOutputStream fos = new FileOutputStream("obj" + (i+1) + ".ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(s);
				oos.close();
				fos.close();
			}
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public synchronized void compute()
	{
		
		for(T shape : shapelist)
			System.out.println(shape.computeArea());
		
	}
	
	
}

