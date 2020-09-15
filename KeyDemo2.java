import java.awt.*;
import java.awt.event.*;

class KeyDemo2 implements KeyListener
{
	static FirstFrame f1;

	public static void main(String args[])		
	{
		f1=new FirstFrame();
		f1.setVisible(true);
		f1.setSize(200,200);
		f1.setLocation(50,70);
		
		KeyDemo2 km=new KeyDemo2();
		km.myMethod();
	}

	void myMethod()
	{
		f1.addKeyListener(this);
			
	}	

	public void keyPressed(KeyEvent ke)
	{
		System.out.println("Key Pressed");
		if(ke.getSource()==f1)
		{
			int code=ke.getKeyCode();
			System.out.println("Second Frame,key text"+ke.getKeyText(code));
		}
	}

	public void keyTyped(KeyEvent ke)
	{
		System.out.println("Key Typed");
		if(ke.getSource()==f1)
		{
			f1.str+=ke.getKeyChar();
			f1.repaint();
		}
	
	}

	public void keyReleased(KeyEvent ke)
	{
		System.out.println("Key Released");		
		if(ke.getSource()==f1)
		{
			System.out.println("First Frame,key code"+ke.getKeyCode());
		}
	}
	
}

class FirstFrame extends Frame
{
	public String str="";
	public void paint(Graphics g)
	{
		System.out.println("Test");
		g.drawString(str,100,100);
	}
}

