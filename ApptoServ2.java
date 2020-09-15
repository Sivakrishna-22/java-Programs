import java.io.*;
import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class apptoServ2 extends applet implements ActionListener
{
	TextArea ta;
	TextField tf1,tf2;
	Button b;
	Label lb1,lb2;
	URL u;
	public void init()
	{
		add(lb1=new Label("enter Product No:"));
		add(tf1=new TextField(20));
		add(lb2=new Label("enter Product No:"));
		add(tf2=new TextField(20));
		add(b=new Button("send to servlet"));
		b.addActionListener(this);
		add(ta=new TextArea(4,10));
	}
	public void actionPerformed(ActionEvent ae)						
	{
		try
		{
			u=new URL("http://localhost:8080/servlet/ServletApp.class?pno="+URLEncoder.encode(tf1.getText())+"&pname="+URLEncoder.encode(tf2.getText()));
			inputStream is=u.openStream();
			DataInputStream dis=new DataInputStream(is);
			String str=dis.readLine();
			while(str!=null)
			{
				ta.append(str);
				str=dis.readLine();				
			}
		}
		catch(Exception e) {}
		
	}	

}