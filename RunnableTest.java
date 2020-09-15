class RunnableDemo implements Runnable
{
	String st;
	Thread th;
	
	RunnableDemo()
	{
		th = new Thread(this,"New Thread");		
	}	
	public void startThread()
	{
		th.start();
	}	
	public void run()
	{
		System.out.println("Running the sub Thread");
		for(int i=1;i<=4;i++)
			System.out.println("sub"+i);
	}
}

class RunnableTest
{
	public static void main(String args[])
	{
		RunnableDemo rn=new RunnableDemo();
		rn.startThread();
		System.out.println("Running the main Thread");
		for(int i=1;i<=5;i++)
			System.out.println("Main"+i);
	}
}