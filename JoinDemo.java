class Join implements Runnable
{
	String str;
	Thread th;
	public Join(String st)
	{
		th=new Thread(this,st);
		str=st;
		th.start();
	}
	public void run()
	{
		System.out.println("This is chil Thread");
		System.out.println(str+"is existing now");
	}
}

class JoinDemo
{
	public static void main(String arg[])
	{
		Thread th=Thread.currentThread();
		Join j1=new Join("Sub1");
		Join j2=new Join("Sub2");
		System.out.println("This is main thread:Now we are joining");		
		try
		{
			j1.th.join();
			j2.th.join();
		}
		catch(InterruptedException e)
		{	
			System.out.println("Thread Interrupted");
		}
		System.out.println("Coming out of main thread");
	}	
}