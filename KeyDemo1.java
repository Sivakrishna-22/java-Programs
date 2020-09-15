import java.awt.*;
import java.awt.event.*;

class KeyDemo1 implements KeyListener
{
	
	static SecondFrame f2;

	public static void main(String args[])		
	{
		

		f2=new SecondFrame();
		f2.setVisible(true);
		f2.setSize(300,300);
		f2.setLocation(360,70);
		
		KeyDemo1 km=new KeyDemo1();
		km.myMethod();
	}

	void myMethod()
	{
	
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
		if(ke.getSource()==f2)	
		{
			//System.out.println("f2 Key Typed"); 	//f2.str="";
			
			f2.str+=ke.getKeyChar();  		//System.out.println(f2.str);
			f2.repaint();
		}
	}

	public void keyReleased(KeyEvent ke)
	{
		System.out.println("Key Released");		
		if(ke.getSource()==f2)
		{
			System.out.println("Second Frame,key code"+ke.getKeyCode());
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