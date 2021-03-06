import java.awt.*;
import java.awt.event.*;

class KeyDemo implements KeyListener
{
	static FirstFrame f1;
	static SecondFrame f2;

	public static void main(String args[])		
	{
		f1=new FirstFrame();
		f1.setVisible(true);
		f1.setSize(200,200);
		f1.setLocation(50,70);

		f2=new SecondFrame();
		f2.setVisible(true);
		f2.setSize(300,300);
		f2.setLocation(360,70);
		
		KeyDemo km=new KeyDemo();
		km.myMethod();
	}

	void myMethod()
	{
		f1.addKeyListener(this);
		f2.addKeyListener(this);		
	}	

	public void keyPressed(KeyEvent ke)
	{
		System.out.println("Key Pressed");
		if(ke.getSource()==f2)
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
		else if(ke.getSource()==f2)	
		{
			System.out.println("f2 Key Typed");
			//f2.str="";
			f2.str+=ke.getKeyChar();
			System.out.println(f2.str);
			f2.repaint();
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

class SecondFrame extends Frame
{
	public String str="";
	public void piant(Graphics g)	
	{
		//Font f=new Font("Sanserif",Font.ITALIC+Font.BOLD,100);
		//g.setFont(f);
                System.out.println("Test");
		g.drawString(str,100,150);	
	}
}