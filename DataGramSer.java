import java.net.*;

public class DataGramSer
{
	public static void main(String args[])  throws Exception
	{
		while(true)
		{
			try
			{
				String str="This is Siva Krishna";
				DatagramSocket ds=new DatagramSocket(999);
				byte b[]=str.getBytes();
				DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),666);
				ds.send(dp);
				ds.close();		
			}
			catch(Exception e) {e.printStackTrace();}
		}
	}	
}