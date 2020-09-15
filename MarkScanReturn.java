import java.util.Scanner;

class Student
{
	int st_no;
	float math_mark;
	float sci_mark;
	float eng_mark;
	
	float calc_avg()
	{
		return(math_mark+sci_mark+eng_mark)/3;
		//System.out.println("Average marks is"+avg_mark);
	}
}

class MarkScanReturn

{
	public static void main(String args[])
	{
		float avg_mark;
		Student st=new Student();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Maths Marks:");		
		st.math_mark=in.nextInt();
		System.out.println("Enter Science Marks:");		
		st.sci_mark=in.nextInt();
		System.out.println("Enter English Marks:");		
		st.eng_mark=in.nextInt();
		avg_mark=st.calc_avg();				
		System.out.println("Average Mark is:"+avg_mark);		
	}	
}