import java.awt.*;
import java.awt.event.*;

class ManyColors extends Frame implements AdjustmentListener
{
	Scrollbar redbar,greenbar,yellowbar;
	Color c;
	Panel Pan1,Pan2;
	ManyColors(String st)	
	{
		super(st);
		Pan1=new Panel();
		Pan2=new Panel();
		c=new Color(0,0,0);
		Pan1.setBackground(c);
		
		yellowbar=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		greenbar=new Scrollbar(Scrollbar.HORIZONTAL,20,10,0,255);
		redbar=new Scrollbar(Scrollbar.HORIZONTAL,30,15,0,255);
		
		redbar.setBackground(Color.red);
		greenbar.setBackground(Color.green);
		yellowbar.setBackground(Color.yellow);

		redbar.addAdjustmentListener(this);		
		greenbar.addAdjustmentListener(this);				
		yellowbar.addAdjustmentListener(this);		
	
		Pan2.setLayout(new GridLayout(3,1));
		Pan2.add(redbar);
		Pan2.add(greenbar);
		Pan2.add(yellowbar);

		add(Pan1,"Center");
		add(Pan2,"South");
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)	
	{
		if(ae.getSource()==redbar)
			System.out.println("Red Bar moved"+ae.getValue());
		if(ae.getAdjustable()==yellowbar)
			System.out.println("Yellow Bar moved");
		int r=redbar.getValue();
		int g=greenbar.getValue();
		int b=yellowbar.getValue();
		c=new Color(r,g,b);
		Pan1.setBackground(c);
	}	
	public static void main(String args[])
	{
		ManyColors mc=new ManyColors("Many Colors");
		mc.setVisible(true);
		mc.setSize(500,400);
	}
}