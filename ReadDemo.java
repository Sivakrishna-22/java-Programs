import java.io.*;
class ReadDemo
{
	public static void main(String args[]) throws IOException
	{
		char ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'z' to quit");	
		do{
			ch=(char)br.read();
			System.out.println(ch);
		}while(ch!='z');
	}
	
}