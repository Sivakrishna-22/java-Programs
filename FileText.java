import java.io.*;

class FileText
{
	public static void main(String args[])	
	{
		try
		{
			File f=new File("test.dat");
			int i,j;
			j=10;
			i=0;
			int k=j/i;
			//f.close();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Occured");
		}
		//catch(FileNotFoundException fe)
		{
			System.out.println("File not found Exception");
		}
	}
}