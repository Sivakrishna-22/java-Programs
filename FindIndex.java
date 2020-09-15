class FindIndex
{
	public static void main(String args[])
	{
		String str=new String("Too much liberty is harmful");
		System.out.println(str);
		int pos=str.indexOf('l');
		System.out.println("First 'l' at "+pos);
		pos=str.indexOf('l',pos+1);
		System.out.println("Second 'l' at "+pos);
		pos=str.indexOf("liberty");
		System.out.println("liberty at "+pos);
	}
}