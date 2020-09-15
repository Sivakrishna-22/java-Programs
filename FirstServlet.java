import javax.servlet.*;

public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest sreq,ServletResponse sres) 
	{
		try
		{
			ServletOutputStream sos=sres.getOutputStream();
			sos.println("<html><body bgcolor=pink>");
			sos.println("<h1>WELCOME TO SERVLETS</h1>");
			sos.println("</body></html>");
		}
		catch(Eception e) {e.printStackTrace();}
		
	}	
}	
