class TestReturn
{
	int i,j;
	public TestReturn()
	{}
	TestReturn assignValues()
	{
		TestReturn re=new TestReturn();	
		re.i=10;
		re.j=20;
		return re;
	}		
}
class ReturnDemo
{
	public static void main(String args[])
	{
		TestReturn rt=new TestReturn();
		TestReturn rt1=rt.assignValues();
		System.out.println("The values are"+rt.i+" "+rt1.j);
	}
}