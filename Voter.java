interface InterfaceName
{
	void addTwoNumber();
}

class AgeHolder
{
	int age = 22;
}

class Voter  extends AgeHolder  implements  InterfaceName          
{
	
	void addTwoNumber()
	{
	   System.out.println("10+12 is"+(10+12));	
	}
	
	public static void main(String args[])
	{
		Voter vote = new Voter();
		AgeHolder agevote = new AgeHolder();
		boolean bool=false;    // false , true
		                                 		
		System.out.println("Before Comparision");
		System.out.println("bool value"+bool);

		if(vote .age>=18)
		   bool = true;
		else if(vote .age<18)
		   bool = false;

		System.out.println("After Comparision");
		System.out.println("bool value"+bool);

		if(bool)
		{
			System.out.println("You are eligible for vote.");
		}
		else
		{
			System.out.println("You are not eligible for vote.");
		}

	}
}