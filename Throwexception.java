class Throwexception
{
	public static void main(String args[])
	{
		try
		{
			throw new StringIndexOutOfBoundsException("hello");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("hello exception caught : "+e);
		}
	}	
}