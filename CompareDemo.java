class CompareDemo
{
	public static void main(String args[])
	{
		String st1="welcome";
		String st2="welcome to MissWorld";
		String st3="Welcome";
		if(st1.compareTo(st2)>0)
			System.out.println(st1+" is greater than "+st2);
		else if(st1.compareTo(st2)<0)
			System.out.println(st1+" is less than "+st2);
		else
			System.out.println(st1+" is equal to "+st2);

		if(st1.compareTo(st3)>0)
			System.out.println(st1+" is greater than "+st3);
		else if(st1.compareTo(st3)<0)
			System.out.println(st1+" is less than "+st3);
		else
			System.out.println(st1+" is equal to "+st3);

	}
}