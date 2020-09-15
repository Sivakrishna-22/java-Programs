import java.net.*;
import java.io.*;

public class Mserver
{
	public static void main(String args[])
	{
		ServerSocket ss;
		Socket sock;
		ServerThread thr;
		int num=0;
		try
		{
			ss=new ServerSocket(7777);
			System.out.println("Server Ready");
			System.out.println("Can I help you?");
			while(true)
			{
				sock = ss.accept();
				System.out.println("Server welcomes the Client"+(++num));
				thr=new ServerThread(sock);
				thr.setName("Client"+(num));
				thr.start();	
			}
		}catch(Exception e) {e.printStackTrace();}
	}	
}

class ServerThread extends Thread
{
	String str="";
	Socket s;
	PrintStream out;
	DataInputStream in;
	ServerThread(Socket sock)			
	{
		s=sock;
	}	
	public void run()
	{
		try
		{
			out=new PrintStream(s.getOutputStream());
			in=new DataInputStream(s.getInputStream());
			while(!((str=in.readLine()).equalsIgnoreCase("quit")))
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Client Message:"+str);
				out.println("Server reply : "+str);		
			}
			out.close();
			in.close();
			s.close();
		}
		catch(Exception e){}
	}	
}