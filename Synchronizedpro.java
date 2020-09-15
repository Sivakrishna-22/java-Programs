class Synchropro
{
	synchronized static void call(String str1)
	{
		System.out.println(str1);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)	
		{
			System.out.println("Interrupted");
		}
	}
}

class Synchro implements Runnable
{
	String str2;
	Thread t1;
	Synchro(String str3)		
	{
		str2=str3;
		t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		Synchropro.call(str2);
	}	
}

class Synchronizedpro
{
	public static void main(String args[])
	{
		Synchro S1=new Synchro("HOW ARE");
		Synchro S2=new Synchro("YOY"); 
		Synchro S3=new Synchro("PRIYANKA CHOPRA,MISS WORLD"); 
	}
}