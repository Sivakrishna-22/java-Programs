import java.net.*;

public class DataGramC
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			DatagramSocket ds=new DatagramSocket(666);
			byte b[]=new byte[100];
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String data=new String(dp.getData());
			System.out.println("The data received fromserver is:"+data);
			ds.close();
		}
		catch(Exception e){e.printStackTrace();}
	}	
}