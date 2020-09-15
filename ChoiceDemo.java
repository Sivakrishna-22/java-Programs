import java.awt.*;
import java.applet.*;
public class ChoiceDemo extends Applet
{
	public void init()
	{
		Choice ch=new Choice();
		ch.addItem("EENADU");
		ch.addItem("VAARTHA");
		ch.addItem("ANDHRAJYOTHI");
		ch.addItem("ANDHRABHOOMI");
		add(ch);
		Choice ch1=new Choice();
		ch1.addItem("HINDU");
		ch1.addItem("NEWSTIME");
		ch1.addItem("DECCANCHRONICAL");
		ch1.addItem("INDIANEXPRESS");
		add(ch1);		
	}
} 