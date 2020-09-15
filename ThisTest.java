class thisDemo
{
	int a,b;
	void assignValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("The values of this object are"+a+" "+b);
	}
}
class ThisTest
{
	public static void main(String args[])
	{
		thisDemo th=new thisDemo();
		thisDemo td=new thisDemo();
		th.assignValues(10,20);
		td.assignValues(4,5);
		th.display();
		td.display();
	}
}