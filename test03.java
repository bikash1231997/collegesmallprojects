class demo
{
	private int x,y,z,i;
	public void input()
	{
		x=4;
		y=6;
		z=1;
	}
	public void display()
	{
		for(i=1;i<=y;i++) 
		{
			z=z*x;
		}
	
	System.out.println("the value is "+z);
	}
}
class test03
{
	public static void main(String args[])
	{
		demo d= new demo();
		d.input();
		d.display();
	}
}
		
		