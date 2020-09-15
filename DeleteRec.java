import java.sql.*;
class DeleteRec
{
	public static void main(String args[])
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"scott","tiger");
			Statement st=con.createStatement();
			stat.executeUpdate("delete emp where empno=1010");
						
		}
		catch(Exception ee) 
		{
			System.out.println(ee);
		}
		
	}
} 