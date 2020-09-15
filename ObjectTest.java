class ObjectDemo
{
	int a,b;
	void sendObject(ObjectDemo ob)
	{
		ob.a=30;
		ob.b=60;
	}
	void display()
	{
		System.out.println("The values are"+a+" "+b);
	}
}
class ObjectTest
{
	public static void main(String args[])
	{
		ObjectDemo od=new ObjectDemo();
		ObjectDemo obj=new ObjectDemo();	
		od.sendObject(obj);
		od.display();
		obj.display();
	}
}