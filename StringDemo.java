class StringDemo
{
	public static void main(String args[])
	{
		char ch[]=new char[] {'I','N','D','I','A'};
		String st1=new String(ch);
		String st2=new String(st1);
		System.out.println("First String is"+st1);
		System.out.println("Second String is"+st2);
	}	
}