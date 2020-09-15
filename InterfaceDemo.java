interface IDemo
{
	public void show(int i,int j);
}

class first implements IDemo
{
	public void show(int i,int j)
	{
		System.out.println("values from first are"+i+" "+j);
	}
}	

class second implements IDemo
{
	public void show(int i,int j)
	{
		System.out.println("values from second are"+i+" "+j);		
		System.out.println("Their sum is"+(i+j));
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		first id=new first();
		second sd=new second();
		id.show(10,20);
		sd.show(10,20);
	}
}