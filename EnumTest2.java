enum Mango{Carrie(10), Fairchild(9), Haden(12);
private int price;
Mango(int p)
{
	price = p;
}
int getprice()
{
	return price;
}
}
class EnumTest2
{
	public static void main(String args[])
	{
		Mango p = Mango.Carrie;
		System.out.println(p.getprice());
	}
}