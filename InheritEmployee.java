import java.util.Scanner;

class Address
{
	private String city,pinco;
	public void getadd()
	{
		System.out.println("Enter city & Pinco");
		Scanner in=new Scanner(System.in);
		city = in.next();
		pinco = in.next();
	}
	public void show()
	{
		System.out.println("Address");	
		System.out.println(city+"\n"+pinco);
	}
}

class Emp extends Address
{
	private int no;
	private String name;
	private Double sal;
	
	public void getemp()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no,name,sal");	
		no = in.nextInt();
		name = in.next();
		sal = in.nextDouble();
		getadd();
	}
	
	public void showemp()
	{
		System.out.println("Employee Details");		
		System.out.println("Employee No:"+no);		
		System.out.println("Employee Name:"+name);		
		System.out.println("Employee Sal:"+sal);		
		show();
	}
}

class InheritEmployee
{
	public static void main(String args[])
	{
		int i,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number Of Employees");		
		n=in.nextInt();
		Emp ob[]=new Emp[n];
		
		for(i=0;i<n;i++)
		{
			ob[i]=new Emp();
			ob[i].getemp();
		}
		System.out.println("Given Employees are");	
		for(i=0;i<n;i++)
		{
			ob[i].showemp();
		}	
		
	}
}