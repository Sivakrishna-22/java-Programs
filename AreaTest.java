class PolyTest
{
	int r,l,b;
	PolyTest(int x,int y,int z)
	{
		r=x;
		l=y;
		b=z;
	}
	void area(int rad)
	{
		double res;
		res=(double)rad*3.14*3.14;
		System.out.println("Area of circle is"+res);
	}	
	void area(int len,int bre)
	{
		int res;
		res=len*bre;
		System.out.println("Area of Rectangle is"+res);	
	}
}
class AreaTest
{
	public static void main(String args[])
	{
		PolyTest pt=new PolyTest(4,5,6);
		pt.area(5);
		pt.area(5,4);
	}
}