import java.awt.*;
import java.awt.event.*;
public class ChboxGroup extends Frame
{
	Checkbox red,green,blue,left,right,center;
	Label l1=new Label("INDIA");
	public ChboxGroup()
	{
		setTitle("awt5 example");
		add("North",l1);
		Panel p1=new Panel();
		CheckboxGroup cg1=new CheckboxGroup();
		red=new Checkbox("Red",false,cg1);
		green=new Checkbox("Green",false,cg1); 
		blue=new Checkbox("Blue",false,cg1); 
		CheckboxGroup cg2=new CheckboxGroup();
		left=new Checkbox("Left",false,cg2);
		right=new Checkbox("Right",false,cg2); 
		center=new Checkbox("Center",false,cg2); 
		p1.setLayout(new GridLayout(5,0));
		//p1.setLayoutColor("Black");
		p1.add(red);
		p1.add(left);
		p1.add(green);
		p1.add(right);
		p1.add(blue);
		p1.add(center);
		add(p1);
		//Panel p2=new Panel();
		//add("South",p2);
	}
	public static void main(String args[])	
	{
		ChboxGroup f=new ChboxGroup();
		f.setBackground(Color.cyan);
		f.setFont(new Font("Arial",Font.PLAIN,20));
		f.setSize(400,400);
		f.setVisible(true);
	}	

}
