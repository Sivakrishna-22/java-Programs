abstract class Bank
{
/*	public int getRateofInterestCommon()
	{
		return 12;	
	}
*/	
  	abstract public int getRateofInterest();
}

class SBI extends Bank
{
	public int getRateofInterest()
	{
		return 7;
	}
}

class AB extends Bank
{
	public int getRateofInterest()
	{
		return 9;
	}
}

class MainClassBank
{
	public static void main(String args[])
	{
	     SBI objSBI = new SBI();
	     System.out.println("SBI Bank Rate of Interest is:"+objSBI.getRateofInterestCommon());
	     AB objAB = new AB();
                     System.out.println("AB Bank Rate of Interest is:"+objAB.getRateofInterestCommon());	
                      // RATE OF INTEREST IS COMMON
		
				
	}
}