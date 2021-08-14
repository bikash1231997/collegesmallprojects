class Multi3 implements Runnable
{  
	String nm;
	Thread ob;
	myt(String x)
	{
		System.out.println("Child Thread Created");
		nm=x;
		ob=new Thread(this);
	}
	public void run()
	{
		System.out.println("Child Thread Start");
		for(int i=0;i<10;i++)
		{
			System.out.println(nm+" ;"+i);
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{ }
		}
		System.out.println("Child Thread Finished");
	}
}
class tdemo
{
	public static void main(String s[])
	{
		System.out.println("Main Starts");
		Multi3 obj=new Multi3("Sagar");
		System.out.println("Still Single Thread");
		obj.ob.start();
		System.out.println("Main Continues");
		for(int p=0;p<=10;p++)
		{
			System.out.println("Main: "+p);
		}
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{ }
		System.out.println("Main Method Completed");
	}
}
