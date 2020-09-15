class Class_Name
{
	void method_Name()	
	{
	    System.out.println("Null perameter method");	
	}

	void method_Name(String val)	
	{
	    System.out.println("     ");			
	    System.out.println(val);	
	}		
	
	public static void main(String args[])
	{
		System.out.println("POLYMORPHISM");
		System.out.println("------------------");
		System.out.println("Hello World "+"Welcome to Java Platform");
		System.out.println("10+19 is "+(10+19));
		
		Class_Name obj = new Class_Name();
		 obj.method_Name();
		obj.method_Name("Single perameter method");
	}	
}

