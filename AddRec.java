import java.sql.*;
class AddRec
{
	public static void main(String args[])
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"scott","tiger");
			Statement st=con.createStatement();
			stat.executeUpdate("Insert Books vlues("106,"Java2","150"));
						
		}
		catch(Exception ee) 
		{
			System.out.println(ee);
		}
		
	}
} 