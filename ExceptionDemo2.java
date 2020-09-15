class ExceptionDemo2
{
	public static void main(String args[])
	{
		int x,y;
		x=10;
		y=0;
		try
		{
			int z=x/y;
			System.out.println("The result is"+z);	
		}
		catch(Exception e)
		{
					System.out.println("y should not be 0");
		}
		
		System.out.println("The program continued");
	}
}