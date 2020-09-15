class Throwsexception
{
	static void myownexception() throws ClassNotFoundException
	{
		throw new ClassNotFoundException("myownexception");
	}	
	public static void main(String args[])
	{
		try
		{
			myownexception();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("myownexception exception caught");
		}
	}
}