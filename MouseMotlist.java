import java.awt.*;
import java.awt.event.*;

public class MouseMotlist extends Frame implements MouseMotionListener
{
	MouseMotlist()
	{
		setSize(400,400);
		setVisible(true);
		setTitle("Example of Mouse Motion");
		addMouseMotionListener(this);
	}	
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse dragged to:"+me.getX()+","+me.getY());
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("Mouse Moved to:"+me.getX()+","+me.getY());
	}
	public static void main(String args[])	
	{
		MouseMotlist ml=new MouseMotlist();
	}
}