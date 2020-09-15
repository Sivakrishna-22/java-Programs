import java.sql.*;
import java.io.*;

public class InoutParam
{
	public static void main(String[]  args)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:MyDSN","scott","tiger");
			CallableStatement cs=con.prepareCall("{call inoutparam(?,?)}");
			cs.setString(1,"abc");
			cs.setInt(2,2000);
			cs.registerOutParameter(2,Types.INTEGER);
			int r=cs.executeUpdate();
			int result=cs.getInt(2);
			System.out.println("The salary is"+result+":"+r);
		}
		catch(Exception ex) {ex.printStackTrace();}
	}	
}