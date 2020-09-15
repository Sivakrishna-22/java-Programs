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

class Mark
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.math_mark=60;
		st.sci_mark=80;
		st.eng_mark=70;
		st.calc_avg();				
	}	
}