import java.awt.*;
import java.awt.event.*;

class ChoiceList extends Frame implements ItemListener
{
	Choice ch;
	TextField tf;
	static ChoiceList cl;
	
	public ChoiceList()
	{	
		setLayout(new FlowLayout());
		ch=new Choice();
		ch.addItem("yellow");
		ch.addItem("orange");
		ch.addItem("pink");
		add(ch);
		ch.addItemListener(this);
		tf=new TextField(60);
		add(tf);
	}
	
	public void itemStateChanged(ItemEvent ie)		
	{
		System.out.println("Item clicked");
		tf.setText("Source is"+ie.getSource());
		System.out.println("Item string name is"+ie.getItem());
		if(ie.getItem().equals("orange"))
			tf.setBackground(Color.orange);
		else if(ie.getItem().equals("yellow"))
			ch.setBackground(Color.yellow);
		else if(ie.getItem().equals("pink"))
			cl.setBackground(Color.pink);
	}
	public static void main(String args[])
	{
		cl = new ChoiceList();
		cl.setVisible(true);
		cl.setSize(250,250);
	}
			
}