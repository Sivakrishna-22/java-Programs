class Serviceclass
{
	Serviceclass()
	{
		System.out.println("Service class object created");
	}	
}  

class Factoryclass
{
	private static Serviceclass s;
	
	static
	{
		System.out.println("Static Initializer Exeecuted");
		s=new Serviceclass();
	}
	
	static Serviceclass getObject()
	{
		return s;
	}
}

class Singltonexample
{
	public static void main(String args[])
	{
		Serviceclass s1=Factoryclass.getObject();
		System.out.println(s1);
		Serviceclass s2=Factoryclass.getObject();
		System.out.println(s2);
	}
}