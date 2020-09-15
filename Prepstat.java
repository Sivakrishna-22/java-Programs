import java.sql.*;
import java.io.*;

public class Prepstat
{
	public static void main(String args[])
	{
		try
		{
			String url="jdbc:odbc:MyDSN";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  // Load Driver Class using forName Method
			Connection con=DriverManager.getConnection(url,"scott","tiger");
			PreparedStatement ps;
			DataInputStream din=new DataInputStream(System.in);
			ResultSet rs;
			ps=con.prepareStatement("select ename,esal from Emp where eno=?");
			
			while(true)	
			{
				System.out.println("Enter the eno of the employee you want to search for...");
				int temp=Integer.parseInt(din.readLine());
				if(temp==0) break;
				ps.clearParameters();
				ps.setInt(1,temp);
				rs=ps.executeQuery();
				System.out.println("This is the record U wanted...");
				rs.next();	
				System.out.println(rs.getString(1)+":"+rs.getString(2));
				rs.close();
			}							
		}
		catch(Exception ee) 
		{
			System.out.println(ee);
		}
		
	}
} 