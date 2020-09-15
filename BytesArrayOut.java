import java.io.*;
class BytesArrayOut
{
	public static void main(String args[]) throws Exception
	{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		byte b[]={'D','E','F'};
		baos.write(b[0]);
		baos.write(b[1]);
		baos.write(b[2]);
		System.out.println("Buffer Contains:"+baos);
		String str="Welcome To The Computer World of Java";
		byte arr[]=str.getBytes();
		baos.write(arr); 
		System.out.println("Buffer Contains:"+baos);
		baos.reset();
		System.out.println("Buffer Contains:"+baos);
	}
}