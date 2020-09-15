import java.sql.*;
import java.io.*;

public class ParamountCall
{
	public static void main(String[]  args)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:MyDSN","scott","tiger");
			CallableStatement cs=con.prepareCall("{call outparam(?,?)}");
			cs.setInt(1,105);
			cs.registerOutParameter(2,Types.INTEGER);
			cs.execute();
		}
		catch(Exception ex) {ex.printStackTrace();}
	}	
}