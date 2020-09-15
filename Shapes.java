class Shapes
{

	int static i;	

	int len = 4;
	int height = 6;   // length and height of rectangle

	int side = 9;  //	side of Square

	int radius = 3;  // radius of circle
		
	void RectArea()
	{
                                     int i;
		System.out.println("Area of rectangle is "+(len*height));
	}

	void RectCircum()
	{
		System.out.println("Circumfrance of rectangle is "+(2*(len+height)));
	}

	void SquareArea()
	{
		System.out.println("Area of Square is "+(side *side ));		
	}

	void SquareCircum()
	{
		System.out.println("Circumfrance of Square is "+(4 *side ));		
	}

	void CircleArea()
	{
		System.out.println("Area of Circle is "+(2*3.14*radius));		
	}	

	void CircleCircum()
	{
		System.out.println("Circumfrance of Circle is "+(3.14*radius*radius));		
	}

	public static void main(String args[])
	{
		Shapes rect[10]=new Shapes();
		Shapes square[5] = new Shapes();
		Shapes circle[2] = new Shapes();					
		
		rect.RectArea();
		rect.RectCircum();

		square.SquareArea();
		square.SquareCircum();

		circle.CircleArea();
		circle.CircleCircum();	
	}

}


	