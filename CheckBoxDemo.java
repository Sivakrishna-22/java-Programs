import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends Frame
{
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	
	public CheckBoxDemo()
	{
		Label l1=new Label("Front end Tools");
		Label l2=new Label("Back end Tools");
		cb1=new Checkbox("VB",false);
		cb2=new Checkbox("ASP",false);
		cb3=new Checkbox("java",false);
		cb4=new Checkbox("ORACLE",false);
		cb5=new Checkbox("SYBASE",false);
		cb6=new Checkbox("SQL SERVER",false);
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(5,2));
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(cb5);
		p1.add(cb6);
		add(p1);
		p1.add(l1);
		p1.add(l2);
	}

	public static void main(String args[])
	{
		Frame f=new CheckBoxDemo();
		f.setBackground(Color.pink);
		f.setFont(new Font("Arial",Font.PLAIN,15));
		f.setSize(400,400);
		f.setVisible(true);
	}

}