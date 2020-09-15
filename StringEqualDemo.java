class StringEqualDemo
{
	public static void main(String args[])
	{
		String st1="java";
		String st2="java";
		String st3="JAVA";
		System.out.println("is "+st1+" equals to "+st2+":"+st1.equals(st2));
		//System.out.println("is "+st2+" equals to "+st3+":"+st2.equals(st3));
		System.out.println("is "+st2+" equals to "+st3+":"+st2.equalsIgnoreCase(st3));
	}
}