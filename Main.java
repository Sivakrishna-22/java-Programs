abstract class Bank
{
	abstract public int getRateofInterest();

	public int getRateofInterestinBank()
	{
		return 5;	
	}
}

class SBI extends Bank
{
	public int getRateofInterest()
	{
		return 9;
	}	
}

class Main
{
	public static void main(String args[])
	{
		Bank objSBI = new SBI();
		System.out.println("SBI Bank Interest"+objSBI.getRateofInterestinBank());
	}
}