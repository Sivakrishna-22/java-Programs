import javax.servlet.*;
public class FormProcess extends GenericServlet
{
	public void service(ServletRequest req,servletResponse res)
	{
		try
		{
			String name=req.getParameter("ename");  // it takes textfield name as parameter;
			String sal=req.getParameter("esal");
			int salary=Integer.parseInt(sal);
			ServletOutputStream sos=res.getOutputStream();
			if(salary>10000)
			{
				sos.println("Mr."+name+" your exceptions are high");				
			}
			else
			{
				sos.println("Mr."+name+" your exceptions are Ok");				
			}
		}	
		catch(Exception e) {}
	}	
}