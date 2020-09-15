import java.applet.*;
import java.awt.*;

public class OvalAppMove extends Applet implements Runnable
{
	int x=0;
	Thread t=new Thread(this);
	boolean b=false;
	public void init()
	{}
	public void start()
	{
		if(t.isAlive())	
		t.resume();
		else
		{
			showStatus("Thread is being started");
			t.start();
			b=true;
		}
	}
	public void stop()
	{
		showStatus("Thread is being suspended");
		t.suspend();
	}
	public void run()
	{
		while(true)
		{
			if(x==200)
			   x=0;	
			repaint();	
		}
	}		
	public void paint(Graphics g)
	{
		if(b)
		{
			g.setColor(Color.red);	
			g.fillOval(x,130,50,50);
			g.setColor(Color.black);	
			g.fillOval(x+8,140,10,15);  // left eye
			g.drawArc(x+8,135,10,10,0,180);	
			g.fillOval(x+26,140,10,15);  // right eye
			g.drawArc(x+26,135,10,10,0,180);	
			g.drawArc(x+26,135,10,10,0,-180); 	// smile 
			g.setColor(Color.white);			
			g.fillOval(x+10,144,5,5);  // left eye-ball
			g.fillOval(x+28,144,5,5);  // right eye-ball
			x++;						
		}

	}
	public void destroy()
	{
		showStatus("Thread is being destroyed");
		t.stop();
	}	
}	