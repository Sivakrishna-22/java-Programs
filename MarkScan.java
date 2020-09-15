import java.util.Scanner;

class Student
{
	int st_no;
	float math_mark;
	float sci_mark;
	float eng_mark;
	float avg_mark;
	void calc_avg()
	{
		avg_mark = (math_mark+sci_mark+eng_mark)/3;
		System.out.println("Average marks is"+avg_mark);
	}
}

class MarkScan
{
	public static void main(String args[])
	{
		Student st=new Student();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Maths Marks:");		
		st.math_mark=in.nextInt();
		System.out.println("Enter Science Marks:");		
		st.sci_mark=in.nextInt();
		System.out.println("Enter English Marks:");		
		st.eng_mark=in.nextInt();
		st.calc_avg();				
	}	
}