// Constrctor -  Construct a building on a land, make machine on a land, make software product on compter // mamory

// java - Constructor is a method of name similar to Class name, through which we can asign values to instance //  variables of an object

// Ex: 

class Dog{

	String breed;   // fields   // instance variables of object objDM              
	int age;          
	String color;
	
	// int static j=10;

	public Dog()   
	{
		breed = "Pet Dog";    // field values 	  
		age = 9;
		color = "White";	
	}
	
	public Dog(String b,int a, String c)   // 3 argument Constructor
	{
		breed = b;    // field values 	  
		age = a;
		color = c;	
	}
	
                void assignValues(String b,int a,String c)
	{
		breed = b;    // field values 	  
		age = a;
		color = c;	
	}
	
	void displayValues()
	{
		System.out.println("Breed:"+breed);
		System.out.println("Age:"+age);
		System.out.println("Color:"+color);
	}
	
	void barking(){
		System.out.println("Dog always barks when they look at new one.");
	}
	
	void hungry(){
		System.out.println("Dog were also hungry as human.");
	}		

	void sleeping(){
		System.out.println("Dog also sleeps as like human.");
	}			
}

class MainClassDOG
{
	public static void main(String args[])
	{
		//Dog objEx;		// Object Declaration
		// Dog objEx = new Dog();         

		System.out.println("--------PD--------");
		Dog objPD = new Dog(); 		                                
objPD.displayValues();

		System.out.println("--------DM--------");
		Dog objDM = new Dog("Dauberman",19,"Black");     							objDM.displayValues();
		
	}
}

