abstract class Bank
{
	abstract public int getRateOfInterest();
}

class SBI extends Bank
{
   public int getRateOfInterest()
   {
      return 7;
   }
}

class AB extends Bank
{ 
  public int getRateOfInterest()
  {
	return 8;
  }
}

class Abstract
{
	public static void main(String args[])
	{
		SBI s=new SBI();
		AB a=new AB();
		System.out.println("SBI Interest"+s.getRateOfInterest());
		System.out.println("AB Interest"+a.getRateOfInterest());
	}
}