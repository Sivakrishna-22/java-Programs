class MyObject
{
	int a,b;
	void sendObject(MyObject m)
	{
		m.a=20;
		m.b=30;	
	}
	void display()
	{
		System.out.println("The values are"+a+" "+b);
	}
}
class MainClass
{
	public static void main(String args[])
	{
		MyObject my=new MyObject();
		my.sendObject(my);
		my.display();
	}
}