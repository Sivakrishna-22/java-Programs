class ParentClass
{
   void pCMethod()
   {
		System.out.println("Parent Class Method");
	}
}

class ChildClass extends ParentClass
{

              void cCMethod()
              {
		System.out.println("Child Class Method");
	}




    public static void main(String args[])
	{
		ChildClass cc = new ChildClass();
		cc.cCMethod();
		cc.pCMethod();
	}
}