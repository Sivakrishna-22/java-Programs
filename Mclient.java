import java.net.*;
import java.io.*;

public class Mclient
{
	public static void main(String args[])
	{
		try
		{
			String str;
			Socket s=new Socket("localhost",7777);
			System.out.println("Client has connected");
			PrintStream out=new PrintStream(s.getOutputStream());
			DataInputStream in=new DataInputStream(s.getInputStream());
			DataInputStream keyB=new DataInputStream(System.in);
			String clientmsg=keyB.readLine();
			while(!(clientmsg.equals("quit")))
			{
				out.println(clientmsg);	
				str=in.readLine();
				System.out.println(str);
				clientmsg=keyB.readLine();
			}
			s.close();
			out.close();
			in.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}


}

