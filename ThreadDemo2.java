class ThreadTest extends Thread
{
	String st;
	ThreadTest()
	{
		super("New Thread");
	}	
	public void startThread()
	{
		start();
	}	
	public void run()
	{
		System.out.println("Running the sub Thread");
		for(int i=1;i<=4;i++)
			System.out.println("sub"+i);
	}
}

class ThreadDemo2
{
	public static void main(String args[])
	{
		ThreadTest th=new ThreadTest();
		th.startThread();
		System.out.println("Running the main Thread");
		for(int i=1;i<=4;i++)
			System.out.println("Main"+i);
	}
}