import java.awt.*;
import java.awt.event.*;
public class Mouseobserver extends Frame implements MouseListener
{
	String str="";
	int x=0,y=0;
	Mouseobserver()
	{
		setSize(400,400);
		setVisible(true);
		setTitle("Example for MouseListener");
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent m1)
	{
		System.out.println("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent m1)
	{
		System.out.println("Mouse Entered");
	}
	public void mouseExited(MouseEvent m1)
	{
		System.out.println("Mouse Exited");
	}
	public void mousePressed(MouseEvent m1)
	{
		System.out.println("Mouse Pressed at"+m1.getX()+","+m1.getY());
	}
	public void mouseReleased(MouseEvent m1)
	{
		System.out.println("Mouse Released at"+m1.getX()+","+m1.getY());
	}
	public static void main(String args[])
	{
		Mouseobserver m=new Mouseobserver();
	}	
}