/* Program implementing the Increment operator */

class IncrementApp
{
	public static void main(String args[])
	{
		int i, j, k;
		i = 10;
		j = i++;  // using postfix increment operator j = 10
		System.out.println("After postfix increment");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		i = 10;
		j = 0;
		j = ++i;   // using prefix increment operator j = 11
		System.out.println("After prefix increment");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}

} 
