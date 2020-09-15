import java.io.*;
class RaccessFred
{
	public static void main(String args[])
	{
		try
		{
			RandomAccessFile raf=new RandomAccessFile("Record.dat","r");
			final long len=raf.length();
			System.out.println("\n \tLength of file="+len);
			int x=raf.read();
			while(x!=-1) 
			{
				System.out.println((char)x);
				x=raf.read();
			}
			raf.seek(len/2);
			byte b;
			while(raf.getFilePointer()!=len)
			{
				b=raf.readByte();
				System.out.print((char)b);
			}
			raf.close();
		}
		catch(EOFException eof) {eof.printStackTrace();}
		catch(IOException ioe) {ioe.printStackTrace();}
	}	
}