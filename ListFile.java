import java.io.*;

class ListFile
{
	public static void main(String args[])
	{
		String dir="/myjava";
		File f1=new File(dir);
		if(f1.isDirectory())
		{
			String fileList[]=f1.list();
			for(int i=0;i<fileList.length;i++)
			{
				System.out.println(fileList[i]);
			}
		}
	}	
}