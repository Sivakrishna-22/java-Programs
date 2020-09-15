import java.io.*;
public class Printdemo
{
	public static void main(String args[])
	{
		PrintWriter p=new PrintWriter(System.out,true);
		p.println("we are printing with print writer");
		int num=10;
		p.println(num);
	}
}