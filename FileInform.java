import java.io.*;

class FileInform
{
	public static void main(String args[])
	{
		//String p=file.separator;
		try
		{
		File f=new File("C:\\myjava\\Random.dat");
		System.out.println("File is:"+f.getName());
		System.out.println("Parent's name:"+f.getParent());
		System.out.println("File ?:"+f.isFile());		
		System.out.println("Directory:"+f.isDirectory());	
		System.out.println("Exists? :"+f.exists());		
		System.out.println("Can Read? :"+f.canRead());		
		System.out.println("Can Write? :"+f.canWrite());			
		System.out.println("Size :"+f.length());			
		System.out.println("LastModified :"+f.lastModified());		
		System.out.println(f.getPath());			
		System.out.println(f.getCanonicalPath());			
		System.out.println(f.getAbsolutePath());
		}
		catch(Exception e)			
		{
			e.printStackTrace();
		}
	
	}	
}