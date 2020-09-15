import java.io.StringBufferInputStream;
class SbisDemo
{
	public static void main(String args[])
	{
		StringBufferInputStream sbis=new StringBufferInputStream("Hello Readers");
		int s;
		while((s=sbis.read())!=-1)		
			System.out.print((char)s);
	}
}