import java.awt.*;

class MyFrame2 extends Frame
{

	public void paint(Graphics g)	
	{
		Font f=new Font("Helvetica",Font.BOLD,14);
		g.setFont(f);
		g.drawString("This is my Frame",75,100);
	}

	public static void main(String args[])
	{
		MyFrame2 f1=new MyFrame2();
		f1.setVisible(true);
		f1.setSize(200,200);
		f1.setTitle("My Frame");
		//Graphics g=new Graphics();
		//f1.paint(g);
		//System.out.println("\n \n \t Press <Ctrl+c> to exit");
	}

}