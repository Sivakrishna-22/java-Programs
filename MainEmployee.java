class Employee
{
	String name;
	private float salary;
	private static float tot_sal;
	
	Employee(String name,float salary) 	
	{
		this.name = name;
		this.salary = salary;
		tot_sal+=salary;
	}
	
	void displayEmployeeDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}

	static void findtotsal()
	{
		System.out.println("Total Salary of all employee is:"+tot_sal);		
	}
}

class MainEmployee
{
	public static void main(String args[])
	{
		Employee.findtotsal();
		Employee e1=new Employee("Ram",8000);
		e1.displayEmployeeDetails();
		Employee e2=new Employee("Rani",9000);
		e2.displayEmployeeDetails();
		Employee e3=new Employee("Raju",9999);
		e3.displayEmployeeDetails();
		Employee.findtotsal();
	}
}