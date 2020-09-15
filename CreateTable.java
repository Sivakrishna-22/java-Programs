import java.sql.*;
import java.util.*;

class CreateTable
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"Scott","Tiger");
			Statement st=c.createStatement();
			boolean b=st.execute("create table books(bno number,bname varchar2(20),bprice number)");
			if(b)
			System.out.println("table not created");	
			else 
			System.out.println("table created Succesfully");	
		}
		catch(Exception ee) 
		{
			//System.out.println(ee);
			e.printStackTrace();
	
		}
		
	}
} 