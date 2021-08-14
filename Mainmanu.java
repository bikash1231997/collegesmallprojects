import java.util.Scanner;

class Mainmanu
{
	Mainmanu()
	{
		Scanner ss= new Scanner(System.in);
		
		System.out.println("1.  Enter a new customer");
		System.out.println("2.  Enter Customer Account Number For Searching");
		System.out.println("3.  Enter a Customer Namae for Search");
		System.out.println("4.  Enter Customer Account Number For Update");
		System.out.println("5.  Enter Customer Account Number For Delete");
		System.out.println("6.  Exit");
		
		int choice= ss.nextInt();		
		System.out.println("enter your choice from the given below"+choice);
		
		switch (choice)
		{
		  case 1:
			System.out.println("Monday");
			break;
		  case 2:
			System.out.println("Tuesday");
			break;
		  case 3:
			System.out.println("Wednesday");
			break;
		  case 4:
			System.out.println("Thursday");
			break;
		  case 5:
			System.out.println("Friday");
			break;
		  case 6:
			System.out.println("Saturday");
			break;
		}
	}
	
	public static void main(String args[])
	{
		new Mainmanu();
	}
		
}