import java.io.*;
class ByteArrayin
{
	public static void main(String args[]) throws Exception
	{
		byte b[]="This is an example for String".getBytes();
		ByteArrayInputStream readArray=new ByteArrayInputStream(b);
		System.out.println("\n Mark Support?"+readArray.markSupported());
		int x=readArray.read();
		while(x!='n')
		{
			System.out.print((char)x);
			if(x=='a')
				readArray.mark(5);
			x=readArray.read();
		}
		System.out.println("\n Available bytes?"+readArray.available());
		readArray.reset();
		x=readArray.read();
		while(x!=-1)
		{
			System.out.print((char)x);
			x=readArray.read();
		}
	}
}