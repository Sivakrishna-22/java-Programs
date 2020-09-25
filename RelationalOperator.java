/* Program implementing the Relational Operators */
class RelationalOperator 
{
	static int value1 = 10;
	static int value2 = 8;
	public static void main(String arg[])
	{
		float a = 3.6f;
		float b = 5.1f;
		float c = 1.1f;
		System.out.println("First Number is:" +a);
		System.out.println("Second Number is:" +b);
		System.out.println("Third Number is:" +c);
		System.out.println("a < b is:" + (a<b));
		System.out.println("a > b is:" + (a<b));
		System.out.println("b == c is:" + (b==c));
		System.out.println("a <= b is:" + (a<=b));
		System.out.println("a >= b is:" + (a>=b));
		System.out.println("a != c is:" + (a!=c));
		System.out.println("b == a + c is:" + (b == a + c));

	}		
}
