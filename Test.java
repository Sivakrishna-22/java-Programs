import java.sql.*;
class Test
{
	public static void main(String args[])
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * From NIIT");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}
		catch(Exception ee) 
		{
			System.out.println(ee);
		}
		
	}
} 