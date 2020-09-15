import java.awt.*;
import java.awt.event.*;
class CloseFrame extends Frame
{
	CloseFrame()
	{
		MyAdapter a=new MyAdapter();
		addWindowListener(a);
	}
	public static void main(String args[])
	{
		CloseFrame cf=new CloseFrame();
		cf.show();
		cf.setSize(200,200);	
	}
}

class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.out.println("Window Event Exeecuted");
		System.exit(0);
	}
}