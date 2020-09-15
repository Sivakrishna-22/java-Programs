class A
{
	int a,b;
	void setdata(int a,int b)	
	{
		this.a = a;
		this.b = b;
	}
	void show()
	{
		//System.out.println(""+this);
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
	}
}

class B extends A
{
	int a,b;
	B(int p,int q,int r,int s)
	{
		a=p;
		b=q;
		super.a=r;
		super.b=s;
	}
	
	void disp()
	{
		//System.out.println(""+this);
		System.out.println("Super class a value is:"+super.a);
		System.out.println("Super class b value is:"+super.b);
		System.out.println("Sub class a value is:"+a);
		System.out.println("Sub class b value is:"+b);
	}
}

class SuperDemo
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B(11,12,23,44);
		b1.disp();
		a1.setdata(90,100);
		a1.show();
	}	
}