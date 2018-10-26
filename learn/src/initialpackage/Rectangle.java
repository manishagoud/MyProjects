package initialpackage;

public class Rectangle {

	int length;
	int breadth;
	
	public int areaofrectangle()
	{
		return(length*breadth);
	}

	Rectangle(){
		length =3;                          // constructor overloading
		breadth=6;
	}
	
	Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
	}

}
