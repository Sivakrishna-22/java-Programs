import java.io.*;
class ReadLineDemo
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter "+" EXIT "+" to stop");	
		do{
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("EXIT"));
	}
}