import java.awt.*;
import java.awt.event.*;

class CheckBoxpane extends Frame implements ItemListener
{
	Panel pan1,pan2;
	TextField tf;
	Checkbox cbold,citalic;
	
	public CheckBoxpane()
	{
		pan1=new Panel();
		tf=new TextField("Change the Font");
		pan1.setBackground(Color.yellow);
		pan1.add(tf);
		pan2=new Panel();
		cbold =new Checkbox("Bold");
		citalic=new Checkbox("Italic");
		pan1.setBackground(Color.green);
		pan2.add(cbold);
		pan2.add(citalic);
		add(pan1,"North");
		add(pan2,"Center");
		cbold.addItemListener(this);
		citalic.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{	
		Font f;
		if(ie.getItem().equals("Bold") && cbold.getState())
		{
			f=new Font("Serif",Font.BOLD,24);
			tf.setFont(f);
		}
		else if(ie.getItem().equals("Italic") && citalic.getState())
		{
			f=new Font("Helvetica",Font.ITALIC,24);
			tf.setFont(f);		
		}
		else
		{
			f=new Font("ArialBlack",Font.PLAIN,16);
			tf.setFont(f);		
		}
	}
	
	public static void main(String args[])		
	{
		CheckBoxpane cpane=new CheckBoxpane();
		cpane.setVisible(true);
		cpane.setSize(300,300);
	}
}