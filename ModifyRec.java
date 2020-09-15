import java.sql.*;
class ModifyRec
{
	public static void main(String args[])
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"scott","tiger");
			Statement st=con.createStatement();
			stat.executeUpdate("update books set book name='Spoken English' where bno='1020'");
						
		}
		catch(Exception ee) 
		{
			System.out.println(ee);
		}
		
	}
} 