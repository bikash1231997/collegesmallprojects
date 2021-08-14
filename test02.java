class demo
{
	private int m,n,r,i;
	private int s=0;
    public void input()
	{
		m=112;
		n=112;
	}
	public void display()
	{
		while (n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println(" the number is "+s);
		if(s==m)
	   {
		System.out.println("pallondram");
	   }
	else
	  {
		System.out.println("not pallandrom");
	   }
    }
}
class test02
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.input();
		d.display();
	}
}
	
	
	