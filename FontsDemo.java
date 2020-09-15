import java.awt.*;

class FontsDemo extends Frame
{
	Font f1,f2,f3;
	FontsDemo()
	{
		f1=new Font("Arialblack",Font.BOLD,20);
		f2=new Font("Arial",Font.ITALIC,40);
		f3=new Font("Helvetica",Font.BOLD+Font.PLAIN,32);
		setTitle("variety Fonts");
	}
	
	public static void main(String args[])
	{
		FontsDemo f=new FontsDemo();
		f.setSize(600,600);
		f.setVisible(true);
	}
	
	public void paint(Graphics g)	
	{
		String str;
		g.setFont(f1);
		g.drawString("WORLD",50,100);
		g.setFont(f2);
		g.drawString("INDIA",50,200);
		g.setFont(f3);
		g.drawString("ANDHRA",50,300);
		str=f1.getName()+":"+f1.getStyle()+":"+f1.getSize()+":"+f2.getName();
		g.setColor(Color.red);
		g.drawString(str,300,350);

		
	}
} 