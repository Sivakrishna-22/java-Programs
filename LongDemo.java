class LongDemo
{
	public static void main(String Args[])
	{
		int bit,byt,kb;
		long mb,gb,count;
		bit=1;
		byt = bit * 8;
		kb = 1024 * byt;
		mb = 1024 * kb;
		gb = 1024 * mb;
		count = 20 * gb;
		System.out.println("20 Gb Hard disk consists of "+count+" number of bits");
	}
}