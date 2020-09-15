 class InsertionSort
{
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			

			//for(j=(i-1);(j>=0);j--)
			//{	
			//	if(arr[j]>key)	
			//	{
			//		arr[j+1]=arr[j];
			//		//j=j-1;		
			//	}
			//}
			//arr[j+1]=key;
			
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		System.out.println(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]={12,11,13,5,6};
		InsertionSort ob=new InsertionSort();
		ob.sort(arr);
		System.out.println("***INSERTION SORT***\n");
		System.out.println("After Sorting");
		printArray(arr);
	}
}