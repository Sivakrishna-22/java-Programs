import javax.servlet.*;
	
public class SecondServ extends GenericServlet
{
	public void service(ServletRequest req,Servletresponse res)
	{
		try
		{
			ServletContext sc=getServletContext();
			FirstServ fs=(FirstServ)sc.getServlet("FirstServ");
			String str=fs.dis();
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