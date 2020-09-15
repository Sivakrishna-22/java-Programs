import java.sql.*;
import java.util.*;

class jdbcDemo
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"Scott","Tiger");
			DatabaseMetaData dbmd=con.getMetaData();

			System.out.println("Major Version:"+dbmd.getDriverMajorVersion());	
			System.out.println("Data Base URL:"+dbmd.getURL());	
			System.out.println("Data Base Driver:"+dbmd.getDriverName());	
			con.close();

		}
		catch(Exception ee) 
		{
			//System.out.println(ee);
			e.printStackTrace();
	
		}
		
	}
} 