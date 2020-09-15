import java.net.*;

class InetAddressTest
{
	public static void main(String args[])throws Exception
	{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());	
		System.out.println(address.hashCode());	
		System.out.println(address.isMulticastAddress());	
		System.out.println(address.toString());	
		address=InetAddress.getByName("suryasiva");
		System.out.println("Address:2 is "+address);
		System.out.println(address.toString());	
		boolean x=false;
		x=address.equals(address);
		System.out.println(x);		
	}	
}