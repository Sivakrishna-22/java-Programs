import javax.servlet.*;
public class StockExchange extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try
		{
			String s=req.getParameter("satyam");
			String w=req.getParameter("wipro");
			String sig=req.getParameter("signode");			
			ServletOutputStream sos=res.getOutputStream();
			sos.println("share value of satyam"+s+"<BR>");
			sos.println("share value of wipro"+w+"<BR>");
			sos.println("share value of signode"+sig+"<BR>");
		}
		catch(Exception e){}
	}	
}