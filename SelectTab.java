import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class SelectTab extends Frame implements ActionListener
{
	Label lb;
	TextField tf;
	TextArea ta;
	Panel pn,pc;
	Button getb,clearb;
	static Connection c;
	PreparedStatement pst;
	SelectTab()
	{
		setBounds(50,50,450,250);
		setBackground(Color.magenta);
		pn=new Panel();
		pn.add(lb=new Label("Enter tablename:"));
		pn.add(tf=new TextField(20));
		pn.add(getb=new Button("Execute"));
		pn.add(clearb=new Button("Clear"));
		add("North",pn);
		pc=new Panel();
		pc.add(ta=new TextArea(10,30));
		add("Center",pc);
		clearb.addActionListener(this);
		getb.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)		
	{
		if(ae.getSource()=getb)
		{
			try
			{
				ta.setText("");
				String str=tf.getText();
				pst=c.prepareStatement("select * from"+str);
				ResultSet rs=pst.executeQuery();
				ResultSetMetadata rsmd=rs.getMetadata();
				int count=rsmd.getColumnCount();
				for(int i=1;i<=count;i++)
					ta.append(rsmd.getColumnName(i)+" ");
				ta.append("\n");
				while(rs.next())
				{
					for(int j=1;j<=count;j++)
						ta.append(rs.getString(j)+" ");
					ta.append("\n");		
				}
				pst.close();
				rs.close();
			}
			catch(Exception e)
			{
				
			}
		}
		else if(ae.getSource()==clearb)
		{
			tf.setText(" ");
			ta.setText(" ");
		}
	}
	public static void main(String args[])	
	{
		SelectTab sb=new SelectTab();
		sb.show();
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c=DriverManager.getConnection("Jdbc:Odbc:MyDSN","scott","tiger");
		}
		catch(Exception e){}
	}	

}