import java.net.*;

class AddressUrl
{
	public static void main(String st[]) throws Exception
	{
		URL hp=new URL("http://localhost");
		URLConnection url;
		hp.openConnection();
		System.out.println("Protocol"+hp.getProtocol());
		System.out.println("Port"+hp.getPort());
		System.out.println("Host"+hp.getHost());
		System.out.println("File:"+hp.getFile(D:\CRR\Java\Throwsexception.java));
	}
}