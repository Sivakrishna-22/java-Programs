// predefined programs or libraries already implemented
// you don't need rewrite in your programs but just import that programs in your programme 
// fixed programs are reused , pakages import

import java.io.*;

public class Puppy
{
	String ppName;  // field of myPuppy object	
	public Puppy()   // Null Constructor
	{
		// Values area not assigned
	}

	public Puppy(String name)  // single perameter Constructor
	{	
		ppName = name;     // initialize field value to the field ppName
		System.out.println("Passed Name is:"+ppName);
	}

	void displayNameofPuppy()
	{
		System.out.println("Accessing of method through object reference");
		System.out.println("Puppy Name is:"+ppName); 
	}
	
	public static void main(String args[])
	{
		Puppy myPuppy;     // Declaration
		myPuppy = new Puppy("Tommy"); // Initialization
		System.out.println("Accessing of instance variable through object reference");
		System.out.println("Puppy Name is:"+myPuppy.ppName);  //  objectReference.Variable
		myPuppy.displayNameofPuppy();    // objectReference.methodName()
	}
}

