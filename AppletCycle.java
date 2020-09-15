import java.applet.Applet;
public class AppletCycle extends Applet
{
	public void init()
	{
		System.out.println("In init");
	}
	public void start()
	{
		System.out.println("In start");
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