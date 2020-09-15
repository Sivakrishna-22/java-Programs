import javax.servlet.*;
import java.sql.*;

public class DisplayBooks extends GenericServlet
{
	Connection c;
	PreparedStatement pst;
	
	public void service(ServletRequest req,ServletResponse res)
	{
		try
		{
			res.setContentType("text/html");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c=DriverManager.getConnection("Jdbc:Odbc:MyDSN","scott","Tiger");
			System.out.println(c);
			pst=c.prepareStatement("select * from books where bno=?");
			String sbno=req.getParameter("bnotext");
			System.out.println(sbno);
			int mybno=Integer.parseInt(sbno);
			pst.setInt(1,mybno);
			ResultSet rs=pst.executeQuery();
			rs.next();
			ServletOutputStream sos=res.getOutputStream();
			sos.println("<html><body bgcolor=pink>");
			sos.println("<h2>HTML DOCUMENT PREPARED IN SERVLET</h2>");
			sos.println("<table border=1><tr><th>bookno</th><th>bookname</th><th>price</th></tr>");
			sos.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getFloat(3)+"</td><tr>");
			sos.println("</table></body></html>");
		}
		catch(Exception e) {}
	}
	
} 
