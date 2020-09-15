class SleepDemo
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
	}
}