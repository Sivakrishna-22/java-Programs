import java.sql.*;
class ShowRec
{
	public static void main(String args[])
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"scott","tiger");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * From books");
			
			while(rs.next())
			{
				System.out.println();
				System.out.println(rs.getInt(1)+" ");
				System.out.println(rs.getString(2)+" ");
				System.out.println(rs.getFloat(3)+" ");
			}
		}
		catch(Exception ee) 
		{
			System.out.println(ee);
		}
		
	}
} 