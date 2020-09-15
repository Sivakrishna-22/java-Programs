import java.awt.*;
import java.applet.*;

public class LabelDemo extends Applet
{
	public void init()
	{
		String str1="This is a java book";
		String str2="Welcome to the Readers";
		Label l1=new Label(str1,Label.RIGHT);	
		add(l1);
		Label l2=new Label(str2,Label.CENTER);	
		add(l2);		
	}
}	