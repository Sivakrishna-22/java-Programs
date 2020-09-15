import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetCourse extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)	 throws ServletException,IOException
	{
		String course=req.getParameter("course");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<B> The selected course is:");
		pw.println(course):
		pw.close();
	}	
} 