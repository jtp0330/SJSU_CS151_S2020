package a7;

import java.io.Serializable;

public class Rectangle extends Shape implements Runnable, Serializable {
	private int edges;
	private String name;
	private int length;
	private int width;
	
	public Rectangle(int edges, String name, int length, int width)
	{
		super(edges, name);
		this.edges = edges;
		this.name = name;
		this.length = length;
		this.width = width;
	}
	public void setLength(int l)
	{
		length = l;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public int getWidth()
	{
		return width;
	}
	public double computeArea()
	{
		return length*width;
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
		return "Name:" + name + "\n " + "Edges: " + edges + "\n " +
	"Length: " + length + "\n " +"Width: " + width + "\n " + "Area: " + this.computeArea();
	}
}
