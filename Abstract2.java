interface Bank   
{
	public int getRateofInterest();
}

class SBI implements Bank
	{
	public int getRateOfInterest()
		{
		return 7;
		}
	}

class Abstract2
	{
	public static void main(String args[])
	{
	   SBI s=new SBI();
	   System.out.println("SBI Interest"+s.getRateOfInterest());
	}
}