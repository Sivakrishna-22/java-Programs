import java.net.*;
import java.io.*;

public class EchoClientDemo
{
	public static void main(String args[]) throws Exception
	{
		Socket client=new Socket("localhost",3456);
		DataInputStream cin=new DataInputStream(client.getInputStream());
		PrintStream cout=new PrintStream(client.getOutputStream());
		cout.println("Can Iuse your services?");
		String msg=cin.readLine();
		System.out.println(msg);
		System.out.println("client socket info");
		System.out.println("Server port number info"+client.getPort());		
		System.out.println("Local system port number is"+client.getLocalPort());
		System.out.println("Local system IP address is"+InetAddress.getLocalHost());
		cin.close();
		cout.close();
		client.close();
	}
	
}