import javax.servlet.*;
	
public class FirstServ extends GenericServlet
{
	public void service(ServletRequest req,Servletresponse res)
	{
		try
		{
			ServletOutputStream sos=res.getOutputStream();
			sos.println("<H1>FIRST SERVLET</H1>");
		}
		catch(Exception e) {e.printStackTrace();}
	}	
	public String dis()
	{
		return "from first servlet";
	}		
}