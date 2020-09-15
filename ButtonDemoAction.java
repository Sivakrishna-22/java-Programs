import java.awt.*;
import java.awt.event.*;

class ButtonDemoAction extends Frame
{
	Button butt;
	public ButtonDemoAction()
	{
		setLayout(new FlowLayout());
		butt=new Button("Click this for brining action");
		MyListener ml=new MyListener();
		butt.addActionListener(ml);
		add(butt);
	}
	
	public static void main(String args[])
	{
		ButtonDemoAction bd=new ButtonDemoAction();
		bd.show();
		bd.setSize(200,200);	
	}
}

class MyListener implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("The Button has been Clicked");
		System.out.println("command is:"+ae.getActionCommand());
	}
}