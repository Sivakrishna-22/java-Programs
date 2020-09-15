package newpack;
class Demo
{
	int k,num;
	public void show(int a,int b)
	{
		System.out.println("the numbers are");
		System.out.println(a+" "+" "+b);
		System.out.println("Their sum is"+(a+b));
	}
}
class PackageDemo
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.show(20,30);
	}
}	