class Mythread implements Runnable 
{
	public void run()
	{
		for (int i=1;i<=10;i++)
			System.out.println("child thread");
		
	}
}
class thread1
{
	public static void main(String args[])
	{
		Mythread t= new Mythread();
		Thread w= new Thread(t);
		w.start();
		for (int i=1; i<=10;i++)
			System.out.println("main thread");
	}
}

/* OUTPUT


main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
main thread
main thread


*/

