import java.awt.*;
import java.applet.*;

public class TextField2 extends Applet
{
	public void init()
	{
		TextField tf1=new TextField("Enter name");
		TextField tf2=new TextField("password");
		tf2.setEchoChar('*');
		add(tf1);
		add(tf2);
	}	
}	