import java.awt.*;
import java.applet.*;

public class TextAreaDemo extends Applet
{
	public void init()
	{
		String str1="Wlcome to the readers";
		Label l1=new Label(str1,Label.RIGHT);
		add(l1);
		TextArea ta1=new TextArea(str1,15,18);
		add(ta1);
	}
}