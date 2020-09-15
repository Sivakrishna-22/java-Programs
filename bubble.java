import java.util.Scanner;

class bubble
{
	public static void main(String args[])
	{
		int a[],n,i,j,t;
		Scanner in=new Scanner(System.in);
		System.out.println("enter n value");
		n=in.nextInt();
		a=new int[n];
		System.out.println("enter elements value");
		
		for (i=0;i<(n);i++)
		{
			a[i]=in.nextInt();
		}		
			
		for (i=0;i<(n-1);i++)
		{
			for (j=0;j<(n-i-1);j++)
			{
				if (a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("the sorted elements are");
		for (i=0;i<n;i++)
			System.out.print(a[i]);
	}
}

