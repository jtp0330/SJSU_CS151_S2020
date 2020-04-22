package a7;

import java.io.Serializable;

public class Circle extends Shape implements Runnable, Serializable{
	private int edges;
	private String name;
	private double radius;
	public Circle(int edge, String name, double radius)
	{
		super(edge, name);
		edges = edge;
		this.name = name;
		this.radius = radius;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double computeArea()
	{
		return ((0.5)*Math.PI * Math.pow(radius, 2));
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
		return "Name:" + name + "\n " + "Edges: " + edges + "\n " + "Radius: " + radius + 
				"\n " + "Area: " + this.computeArea();
	}
}
