import java.awt.*;
import java.awt.event.*;

class ActionTextList extends Frame implements TextListener,ActionListener
{
	TextField tf;
	TextArea ta;

	ActionTextList()
	{
		tf=new TextField(20);
		ta=new TextArea("Test",15,30) ;
		setLayout(new FlowLayout());

		add(tf);
		add(ta);

		ta.addTextListener(this);
		tf.addTextListener(this);

		tf.addActionListener(this);
	}	
	
	public void textValueChanged(TextEvent te)		
	{
		if(te.getSource()==tf)
		{
			try
			{
				int i=Integer.parseInt(tf.getText());
			}
			catch(NumberFormatException nfe)
			{
				tf.setText(""+0);
			}
		}
		else if(te.getSource()==ta)
		{
			System.out.println(ta.getText());
		}
	}
	
	public void actionPerformed(ActionEvent ae)	
	{
		System.out.println("source="+ae.getSource());	
		System.out.println("number="+tf.getText());	
	}
	
	public static void main(String args[])
	{
		ActionTextList atl=new ActionTextList();
		atl.setVisible(true);
		atl.setSize(400,400);	
	}
}
