import java.io.*;
public class SequenceTwo
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		FileInputStream fis1=new FileInputStream("Random.dat");
		FileInputStream fis2=new FileInputStream("Record.dat");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int s;
		while((s=sis.read())!=-1)
			System.out.print((char)s);
	}
}	