package mypackage1;

public class MethodEx {

	public static void main(String[] args) {

		mymethod();
		add(40,30);
		int c = add (40,30);
		System.out.println(c);
	}

	public static void mymethod()
	{
	
		System.out.println("happy");
		
	}
	
	public static int add (int a , int x)
	{
		//System.out.println("answer is" + (a+x));
		return (a+x);
	}
}
