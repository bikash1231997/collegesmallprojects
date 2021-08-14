import java.util.Scanner;
class demo
{
	 private int a,b,c;
	 public void input()
	 {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the 1st integer");
		 a=s.nextInt();
		 System.out.println("enter the 2nd no.");
		 b=s.nextInt();
		 System.out.println("enter the 3rd no.");
		 c=s.nextInt();
	 }
	 public void display()
	 {
		 if(a>b&&a>c)
		 {
			 System.out.println("the bigger number is ="+a);
		 }
		 else if(b>c)
		{
			System.out.println("the greater number is"+b);
		}
		else
		{
			System.out.println("the greatest number is "+c);
		}
	 }
}
class test06
{
	public static void main(String args[])
	{
		demo d= new demo();
		d.input();
		d.display();
	}
}
