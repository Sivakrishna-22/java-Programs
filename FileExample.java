import java.io.*;

class FileExample
{
	public static void main(String args[])	
	{
		try
		{
			FileInputStream fis=new FileInputStream("Record.dat");
			int x=fis.read();
			while(x!=-1)
			{
				System.out.print((char)x);
				x=fis.read();
			}
		}
		catch(FileNotFoundException fe)	{fe.printStackTrace();}
		catch(IOException e)	{e.printStackTrace();}	
	}	
}	