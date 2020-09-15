class ObjectTest
{
	int i,j;
	void setValues(int x,int y)
	{
		i=x;
		j=y;
	}
	void display()
	{
		System.out.println("values are "+i+" "+j);
	}
}  
class ObjectMain
{
	public static void main(String args[])		
	{
		ObjectTest ob=new ObjectTest();
		ObjectTest ot=ob;
		ob.setValues(4,5);
		System.out.println("The Present");
		ob.display();
		ot.setValues(10,20);
		System.out.println("The New");
		ob.display();
	}
}