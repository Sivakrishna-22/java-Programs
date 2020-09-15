import java.awt.*;
import java.awt.event.*;

class ChActionItem extends Frame implements ActionListener,ItemListener
{
	MenuBar bar;
	Menu courses;
	MenuItem BA,BSc,BCom;
	CheckboxMenuItem vacant;
	MenuShortcut shortcut;
	String mesg="";
	TextField tf=new TextField();
	ChActionItem()
	{
		add(tf,"North");
		bar=new MenuBar();
		BA=new MenuItem("BA");
		courses=new Menu("courses");
		shortcut=new MenuShortcut('b',true);
		BSc=new MenuItem("BSc",shortcut);
		BCom=new MenuItem("BCom");
		vacant=new CheckboxMenuItem("seats vacant",true);
		courses.add(BA);
		courses.add(BSc);
		courses.add(BCom);		
		courses.addSeparator();		
		courses.add(vacant);		
		bar.add(courses);
		setMenuBar(bar);
		BA.addActionListener(this);
		BSc.addActionListener(this);
		BCom.addActionListener(this);
		vacant.addItemListener(this);
	}

	public void actionPerformed(ActionEvent ae)			
	{
		if(ae.getSource()==BA)
		{
			mesg="BA with english and telugu literature";
			repaint();
		}
		else if(ae.getSource()==BSc)
		{
			tf.setText(""+BSc.getShortcut());
			mesg="BSc with HomeScience and Biochemistry";
			repaint();	
		}
		else if(ae.getSource()==BCom)
		{
			mesg="BCom with Commerce and Computers";
			repaint();	
		}
	}

	Font f=new Font("Helvetica",Font.BOLD,50);		
	public void paint(Graphics g)	
	{
		g.setFont(f);	
		g.drawString(mesg,100,100);
	}
	public void itemStateChanged(ItemEvent ie)	
	{
		if(!vacant.getState())
		{
			BA.setEnabled(false);
			BSc.setEnabled(false);
			BCom.setEnabled(false);
		}
		else
		{
			BA.setEnabled(true);	
			BSc.setEnabled(true);	
			BCom.setEnabled(true);	
			mesg="Few seats ONLY";
			repaint();
		}
	}
	public static void main(String args[])
	{
		ChActionItem cai=new ChActionItem();
		cai.setVisible(true);
		cai.setSize(600,300);	
	}	
	
}