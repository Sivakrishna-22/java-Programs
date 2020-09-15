import java.sql.*;

class JDBCex1
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
				//System.out.println(rs.getString(1));
				int empno=rs.getint(1);
				string empname=rs.getString(2);
				float empsal=rs.getFloat(3);
				System.out.println(""empno="+empno+"empname="+empname+"empsal="+empsal);
			}
		}
		catch(Exception ee) 
		{
			//System.out.println(ee);
			e.printStackTrace();
	
		}
		
	}
} 