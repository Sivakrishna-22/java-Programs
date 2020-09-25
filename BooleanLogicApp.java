/* Program implementing the boolean logical operators */
class BooleanLogicApp
{
	public static void main(String args[])
	{
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = b1 & b2;
		boolean b4 = b1 | b2;
		boolean b5 = b1 ^ b2;
		boolean b6 = !b2;
		System.out.println("b1 = " + b1);		// false
		System.out.println("b2 = " + b2);		// true
		System.out.println("b1 & b2 = " + b3);	// false
		System.out.println("b1 | b2 = " + b4);	// true
		System.out.println("b1 ^ b2 = " + b5);	// true
		System.out.println("!b2 = " + b6);		//false
		int i = 10;
		boolean b7 = 6 == 4 & i < 4;			// false
		boolean b8 = b3 ^ b2;				// true
		boolean b9 = b4 | b1 & b2;			// true 
		System.out.println("b7 = " + b7);
		System.out.println("b8 = " + b8);		 
		System.out.println("b9 = " + b9);		 
	}
}
