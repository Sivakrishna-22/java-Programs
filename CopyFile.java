import java.io.*;
class CopyFile
{
	public static void main(String args[])
	{
	try
	{
		FileInputStream fromFile=new FileInputStream("Random.dat");
		FileOutputStream toFile=new FileOutputStream("Cfile.dat");		
		int x=fromFile.read();
		while(x!=-1)
		{	
			toFile.write((char)x);
			x=fromFile.read();
			System.out.print((char)x);
		}
		fromFile.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	
	}
}	