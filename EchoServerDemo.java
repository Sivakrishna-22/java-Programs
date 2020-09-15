import java.net.*;
import java.io.*;

public class EchoServerDemo
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ssk=new ServerSocket(80);
		System.out.println("Echo Server on wait");
		System.out.println("waiting for the request");
		Socket sock=ssk.accept();
		System.out.println("Client has made a request");
		DataInputStream in=new DataInputStream(sock.getInputStream());
		PrintStream out=new PrintStream(sock.getOutputStream());
		String msg=in.readLine();
		System.out.println("Message received from Client:"+msg);
		String str="Welcome to my Client";
		out.println("Sending a message from server:"+str);
		System.out.println("Server socket info");
		System.out.println("Sending the Information as per your request");
		
		System.out.println("Client port number is"+sock.getPort());		
		System.out.println("Local system port number is"+sock.getLocalPort());
		System.out.println("Server socket:"+ssk.getLocalPort());
		//System.out.println("Local system IP address is"+InetAddress.getLocalHost());
		in.close();
		out.close();
		sock.close();
	}
	
}