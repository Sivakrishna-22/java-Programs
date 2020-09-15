import java.awt.*;
import java.awt.event.*;
class MouseAdapt extends Frame
{
	Canvas can;
	public MouseAdapt()
	{
		setLayout(new FlowLayout());
		can=new Canvas();
		can.setSize(250,250);
		add(can);
		//can.addMouseListener(new MyMouseAdapter());
	}
}

class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		//dispose();
		System.exit(0);
	}
	
	public static void main(String args[])
	{
		MouseAdapt ma=new MouseAdapt();
		ma.setVisible(true);
		ma.setSize(300,300);
	}
}