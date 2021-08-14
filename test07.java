import java.util.Scanner;
class Demo
{
private int no;
private int dg;
private int sum;

public void input()
{
	Scanner s=new Scanner(System.in);
	
	System.out.print("\n enter the number");
	no=s.nextInt();
	
}
public void display()
{
	while(no!=0)
	{
		dg=no%10;
		sum=sum+dg;
		no=no/10;
	}
	System.out.print("\n the sum of the digits are"+sum);
}
}
class test07
{
	public static void main(String args[])
	{
		Demo d=new Demo();
        d.input();
		d.display();
	}
}
		
	