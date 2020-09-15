import java.io.*;
class FinallyDemo
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Enter a char action:");
			int i=System.in.read();
			System.out.println("Char action entered is:"+(char)i);
		}
		catch(IOException e)
		{
			System.out.print("Catch block happens only if action occurs");
			e.printStackTrace();
		}
		finally
		{
			System.out.print("Finally always occurs");	
		}
		
	}	
}