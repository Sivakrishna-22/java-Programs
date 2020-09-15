import java.awt.*;
import java.net.*;
import java.applet.*;

public class ImageApplet extends Applet
{
	Image img;
	public void init()
	{
		super.init();
		setBackground(Color.gray);
		System.out.println(getDocumentBase());
		add(new Button("Show Image"));
	}
	public boolean action(Event e,Object o)
	{
		try
		{
			if(o.equals("Show Image"))
			{
				Toolkit tk=Toolkit.getDefaultToolkit();
				img=tk.getImage("StandingTable.png");
				setBackground(Color.cyan);
				repaint();	
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return super.action(e,o);
	}
	public void paint(Graphics g)		
	{		
		if(img!=null)
			g.drawImage(img,50,50,this);
		else
			System.out.println("Image Not Loaded");
	}
}	