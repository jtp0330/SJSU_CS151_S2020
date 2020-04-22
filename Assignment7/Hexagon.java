package a7;

import java.io.Serializable;

public class Hexagon extends Shape implements Serializable{
	private int edges;
	private String name;
	
	public Hexagon(int edges, String name)
	{
		super(edges, name);
		this.edges = edges;
		this.name = name;
	}
	
	public double computeArea() 
	{
		return (Math.pow(edges,2) * Math.sqrt(3) * 3 * 0.5); 
	}
	
	public String toString()
	{
		return "Name:" + name + "\n " + "Edges: " + edges + "\n " + "Area: " + this.computeArea();
	}
}
