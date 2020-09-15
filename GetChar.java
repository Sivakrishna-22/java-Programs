class Getchar
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Welcometo the readers");
		char arr[]=new char[10];
		sb.getChars(0,7,arr,0);
		System.out.println(arr);
	}
}