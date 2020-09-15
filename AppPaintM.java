import java.awt.*;

public class AppPaintM extends java.applet.Applet
{
	public void init()
	{
		System.out.println("In init");
	}
	public void start()
	{
		System.out.println("In start");
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello",200,200);
		g.setColor(Color.black);
		g.drawRect(100,90,60,60);
	}
	public void stop()
	{
		System.out.println("In stop");
	}
	public void destroy()
	{
		System.out.println("In destroy");
	}

}