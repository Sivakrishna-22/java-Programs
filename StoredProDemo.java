import java.sql.*;
import java.io.*;

class StoredProDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("Jdbc:Odbc:MyDSN","scott","tiger") ;
			CallableStatement cs=c.prepareCall("{call insertpro(?,?,?)}");  //this procedure carries all input parameters.
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("enter book no");
			String str1=dis.readLine();
			int eno=Integer.parseInt(str1);
			System.out.println("enter book name");
			String str2=dis.readLine();
			System.out.println("enter book price");
			String str3=dis.readLine();
			Float fsal=new Float(str3);
			float sal=fsal.floatValue();
			cs.setInt(1,eno);
			cs.setString(2,str2);
			cs.setFloat(3,sal);
			boolean b=cs.execute();
			if(b==false)	
			{
				int rows=cs.getUpdateCount();
				System.out.println("inserted"+rows+"row");
			}	
		}
		catch(Exception e)
		{}
	}
}	