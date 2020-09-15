import java.awt.*;
import java.awt.event.*;

class ChBoxGroup2 extends Frame implements ItemListener
{
	Panel pan1,pan2;
	TextField tf;
	Checkbox cbold,citalic,cplain;
	CheckboxGroup cbg;		
	
	public ChBoxGroup2()
	{
		setLayout(new GridLayout());
		cbg=new CheckboxGroup();
		pan1=new Panel();
		tf=new TextField("Change The Font",20);
		pan1.setBackground(Color.blue);
		pan1.add(tf);
		pan2=new Panel();
		cbold=new Checkbox("Bold",false,cbg);
		citalic=new Checkbox("Italic",false,cbg);
		cplain=new  Checkbox("Plain",true,cbg);
		pan2.add(cbold);
		pan2.add(citalic);
		pan2.add(cplain);
		add(pan1);
		add(pan2);
		cbold.addItemListener(this);
		citalic.addItemListener(this);
		cplain.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)	
	{
		Font f;
		if(ie.getItem().equals("Bold") && cbold.getState())
		{
			f=new Font("Serif",Font.BOLD,16);
			tf.setFont(f);
		}	
		else if(ie.getItem().equals("Italic") && citalic.getState())
		{
			f=new Font("Arial",Font.ITALIC,16);
			tf.setFont(f);		
		}
		else
		{
			f=new Font("Helvetica",Font.PLAIN,16);
			tf.setFont(f);		
		}
	}

	public static void main(String args[])
	{
		ChBoxGroup2 cbg=new ChBoxGroup2();
		cbg.setVisible(true);
		cbg.setSize(300,300);
	}
}	