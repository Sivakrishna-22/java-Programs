import java.awt.*;

public class ListDemo extends Frame
{
	ListDemo(String Name)
	{
		super(Name);
		Button b=new Button("Click");
		List c=new List();
		c.setMultipleSelections(true);
		c.add("Item1");
		c.add("Item2");
		c.add("Item3");
		add("North",b);
		add("South",c);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String args[])		
	{
		ListDemo id=new ListDemo("My list");
	}	
}