class Polymorphism2
{
	void methodName()
	{
		System.out.println("Null argument method");
	}

	void methodName(String one)
	{
		System.out.println(one);
	}

	public static void main(String args[])
	{
		System.out.println("Hello world "+"welcome to Java");
		System.out.println("10+19 IS "+(10+19));
		Polymorphism2 obj = new Polymorphism2();
		obj.methodName();		
		obj.methodName("One argument method");	
	}
}