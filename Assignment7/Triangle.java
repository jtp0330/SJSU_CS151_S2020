package a7;

import java.io.Serializable;

public class Triangle extends Shape implements Runnable, Serializable{
	private int edges;
	private String name;
	private int base;
	private int height;
	
	public Triangle(int edges, String name, int base, int height)
	{
		super(edges,name);
		this.edges = edges;
		this.name = name;
		this.base = base;
		this.height = height;
	}
	
	public void setBase(int b)
	{
		base = b;
	}
	
	public int getBase()
	{
		return base;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public double computeArea()
	{
		return ((0.5) * base * height);
	}
	
	public void run() {
		try {
			super.run();
			//System.out.println("Current Thread: " + this.computeArea() + Thread.currentThread().getId());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void start()
	{
		Thread tobj = new Thread(this);
		tobj.start();
	}
	
	public String toString()
	{
		return "Name:" + name + ", Edges: " + edges + ", Base: " + base +", Height: " + height + ", Area: " + this.computeArea();
	}
}
