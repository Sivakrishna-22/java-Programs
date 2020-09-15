class MultiCatch
{
	public static void main(String args[])	
	{
		try
		{
			int denom=Integer.parseInt(args[0]);
			System.out.println(1000/denom);	
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.print("printStackTrace()");
			aie.printStackTrace();
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("getMessage()"+ae.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("toString()"+e.toString());
		}
	}	
}