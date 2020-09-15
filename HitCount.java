import javax.servlet.*;
public class HitCount extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		long count=0;
		try
		{
			ServletOutputStream sos=res.getOutputStream();
			count++;
			sos.println("you are the"+count+"visitor to visit this site");
		}	
		catch(Exception e){}
	}	
}