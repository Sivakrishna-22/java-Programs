class StringMisc
{
	public static void main(String args[])
	{
		String str=new String(" welcome ");
		System.out.print(str+" After trim is : ");
		str=str.trim();
		System.out.println(str);
		System.out.print("in "+str+" Letter 'e' replace with '6' : ");
		str=str.replace('e','6');
		System.out.println(str);
		str=str.toLowerCase();
		System.out.println("Lower case is : "+str);
		str=str.toUpperCase();
		System.out.println("Upper case is : "+str);
	}	
}