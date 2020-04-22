package a7;

public class Shape implements Runnable {
	
	private int edges;
	private String name;
	
	public Shape(int edge, String na)
	{
		edges = edge;
		name = na;
	}
	
	public void setEdges(int e)
	{
		edges = e;
	}
	
	public int getEdges()
	{
		return edges;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public double computeArea()
	{
		return 0.0;
	}
	
	public void run() {
		try {
			
			System.out.println("Current Thread: " + Thread.currentThread().getId() + ", Name: "+ this.getName() + ", Area: " + this.computeArea() +"");
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
		return "Name:" + name + "\n" + ", Edges: " + edges;
	}
	
}
