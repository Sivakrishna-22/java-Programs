import java.io.*;
class SkipLength
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream	fis=new FileInputStream("Record.dat");
		int len=fis.available();
		System.out.println("\n \t length of the file is:"+len);
		for(int i=0;i<len/4;i++)
		System.out.println((char)fis.read());
		fis.skip(len/4);
		System.out.println("available bytes to read="+fis.available());
		byte arr[]=new byte[len/4];
		fis.read(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println("\n\n"+(char)arr[i]);
		int leftOver=fis.available();
		System.out.println("\n\n available bytes to read="+leftOver);
		byte arr1[]=new byte[len/4];
		fis.read(arr1);
		for(int i=0;i<arr.length;i++)
			System.out.println("\n\n"+(char)arr1[i]);
		leftOver=fis.available();
		System.out.println("\n\n available bytes to read="+leftOver);
	}
}