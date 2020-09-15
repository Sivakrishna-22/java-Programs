class FruiteJuice
{
	enum FruiteJuiceSize{SMALL, MEDIUM, LARGE};
	FruiteJuiceSize size;               // size = MEDIUM
}

class FruiteJuiceTest
{
	public static void main(String args[])
	{
		FruiteJuice juice = new FruiteJuice();
		juice.size = FruiteJuice.FruiteJuiceSize.SMALL;
		System.out.println("Size: "+juice.size);
	}
}


// User Defined data Type   - ClassName,EnumName
// Predefined data Type - int, float, char,String, etc., 