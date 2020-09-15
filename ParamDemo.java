import java.awt.*;
import java.applet.*;	

public class ParamDemo extends Applet
{
	String empname;
	String dept;
	int eno;
	String s;
	public void start()
	{
		empname=getParameter("ename");
		dept=getParameter("dept");
		s=getParameter("empno");
		eno=Integer.parseInt(s);
	}	
	public void paint(Graphics g)
	{
		g.drawString("Emp name="+empname,5,10);
		g.drawString("Department="+dept,5,40);
		g.drawString("Empno="+eno,5,70);
	}
}