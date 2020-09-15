import javax.servlet.*;
public class ServletApp extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) 
	{
		try
		{
			String mypno=req.getParameter("pno");
			String mypname=req.getParameter("pname");
			ServletOutputStream sos=res.getOutputStream();
			sos.println("product no entered in applet is:"+mypno+"<BR>");
			sos.println("product name entered in applet is:"+mypname);
		}
	}	
}