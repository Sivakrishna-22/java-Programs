/* Abstraction - Expose Common things and hide un common things */

// New data Type - user defined data type

class _ClassName
{
	int property = 12;
		
	void methodName()
	{
	    System.out.println("Hi world this is example of New data type");	
	}
	
	public static void main(String args[])
	{
	   _ClassName obj = new _ClassName();
	   System.out.println("Propert value is: "+obj.property);
	   obj.methodName();		
	}
}

