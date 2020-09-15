class A
{
	private int x;
	public int y;
	protected int z;
	
	int t;
	
	public void set()
	{
		x=1;
		y=2;
		z=4;
		t=5;
	}

	public void setC()
	{
		x=3;
		y=6;
		z=9;
		t=12;
	}
	
	public void output()
	{
		System.out.println("x:"+x);
	}
}

class B extends A
{
	public void show()
	{
		output();
		System.out.println("y:"+y);
		System.out.println("z:"+z);
		System.out.println("T:"+t);
	}
}

class C extends B
{
	public void show()
	{
		System.out.println("y:"+y);		
		System.out.println("z:"+z);
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		B bob = new B();
		bob.set();
		bob.show();
		C cob = new C();
		cob.setC();
		cob.show();
	}	
}