class demo 
{ 
private int a,b,c;
public void input()
{
	a=20;
	b=30;
	c=40;
}
public void display()
{
	if(a>b&&a>c)
	{
		System.out.println("the greast number is a"+a);
	}
	else if(b>c)
	{
		System.out.println("the greatest number is b"+b);
	}
	else
	{
		System.out.println("the greatest number is c"+c);
	}
}
}
class test01
{
	public static void main (String args[])
	{
		demo d=new demo();
		d.input();
		d.display();
	}
}

	
	