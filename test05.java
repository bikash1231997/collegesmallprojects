class test05
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=1;
		for( int i=1; i<=b; i++)
		{
			c=c*a;
		}
		System.out.println("the value is ="+c);
	}
}
