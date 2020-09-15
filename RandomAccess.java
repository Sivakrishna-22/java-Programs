import java.io.*;
	
class RandomAccess
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("Record.dat");
			DataInputStream dis=new DataInputStream(fis);
			RandomAccessFile raf=new RandomAccessFile("Random.dat","rw");
			raf.seek(raf.length());
			String str;
			while((str=dis.readLine())!=null)
			{
				raf.writeBytes(str+"\n");
				System.out.println(str);
			}
			raf.close();
			dis.close();
		}
		catch(IOException ioe)	{ioe.printStackTrace();}
	}	
}