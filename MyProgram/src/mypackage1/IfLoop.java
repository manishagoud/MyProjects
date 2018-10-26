package mypackage1;

import java.util.Scanner;
public class IfLoop {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		
		System.out.println("enter the value of x");
		
		int user = x.nextInt();
		
	if (user % 2 == 0)
	{
		System.out.println("is even");
	}
	
	else 
	{
		System.out.println(" is odd");
	}
	}

}
