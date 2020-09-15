class ThreadPriority extends Thread
{
	ThreadPriority(String str)
	{
		super(str);
	}	
	public static void main(String args[])
	{
		ThreadPriority t1=new ThreadPriority("First");
		ThreadPriority t2=new ThreadPriority("Second");
		ThreadPriority t3=new ThreadPriority("Third");
		ThreadPriority t4=new ThreadPriority("Fourth");
		t1.setPriority(10);
		t2.setPriority(10);
		t3.setPriority(4);
		t4.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	public void run()
	{
		String name="";
		for(int i=0;i<10;i++)
		{
			name=Thread.currentThread().getName();
			if(name.equals("First"))
				System.out.println(name+"--"+i);
			else if(name.equals("second"))
				System.out.println(name+"--"+i);
			else if(name.equals("Third"))
				System.out.println(name+"--"+i);
			else if(name.equals("Fourth"))
				System.out.println(name+"--"+i);

		}
	}
}


