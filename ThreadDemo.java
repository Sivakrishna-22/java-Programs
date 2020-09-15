class ThreadDemo
{
	public static void main(String args[])
	{
		Thread th=Thread.currentThread();
		System.out.println("The present running thread is"+th);
		Thread t=Thread.currentThread();
		t.setName("Thread new");
		System.out.println("New name is"+t);
	}
}	 