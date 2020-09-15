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
		can.addMouseListener(new MyMouseAdapter());
	}
}

class MyMouseAdapter extends MouseAdapter
{
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse Entered");
		can.setBackground(Color.cyan);
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse pressed");	
		System.out.println("X coord is"+me.getX());	
		System.out.println("Y coord is"+me.getY());	
		can.setBackground(Color.green);
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released");	
		System.out.println("X coord is"+me.getX());	
		System.out.println("Y coord is"+me.getY());	
		can.setBackground(Color.pink);
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked");	
		System.out.println("X coord is"+me.getX());	
		System.out.println("Y coord is"+me.getY());	
		can.setBackground(Color.yellow);
	}
}

class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		dispose();
		System.exit(0);
	}
	
	public static void main(String args[])
	{
		MouseAdapt ma=new MouseAdapt();
		ma.setVisible(true);
		ma.setSize(300,300);
	}
}