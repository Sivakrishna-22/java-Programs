import javax.servlet.http.*;
import javax.servlet.*;

public class HttpGetPost extends HttpServlet
{
	public void doGet(HttpServletRequest hsreq,HttpServletResponse hsres)
	{
		try
		{
			String user=hsreq.getParameter("t1");
			String card=hsreq.getParameter("p1");
			ServletOutputStream sos=hsres.getOutputStream();
			sos.println("user name:<br>"+user);
			sos.println("<br>credit card number :<br>"+card);
		}
		catch(Exception e) {}
	}
	public void doPost(HttpServletRequest hsreq,HttpServletResponse hsres)
	{
		try
		{	
			String name=hsreq.getParameter("t2");
			String sal=hsreq.getParameter("t3");
			ServletOutputStream sos=hsres.getOutputStream();
			sos.println("user name :<br>"+name);
			sos.println("<br>salary:<br>"+sal);
		}
		catch(Exception e) {}
	}		
}
