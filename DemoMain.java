interface Mydemo
{
	public void show(int i,int j);
	public void result(int i,int j);
}

class InterDemo implements Mydemo
{
	public void show(int i,int j)
	{
		System.out.println("The numbers are"+i+" "+j);
	}
	public void result(int i,int j)
	{
		System.out.println("Sum is"+(i+j));	
	}
}

class DemoMain
{
	public static void main(String args[])
	{
		Mydemo m=new InterDemo();
		m.show(10,20);
		m.result(10,15);
	}	
}