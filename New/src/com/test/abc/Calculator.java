package com.test.abc;
import java.lang.Iterable;
import java.util.*;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		double a;
		double b;
		int option;
		//char operator;
		double total=0.0;
		
		Scanner expression= new Scanner(System.in);
		
		System.out.println("enter the two numbers");
		//System.out.println("enter the sentence");
		a= expression.nextDouble();
		
		b= expression.nextDouble();
		
		//String s= expression.nextLine();

		//List<String> list= new ArrayList<String>();
		//List<Double> newlist= new ArrayList<Double>();
		
		/*String[] Apple=s.split(" ");
		
		for(String str : Apple)
		{
        
			try
			{
			newlist.add((double) Integer.parseInt(str));
			}
			
			catch (NumberFormatException e) 
			{
				list.add(str);
			}

			System.out.println("Numbers");
		
			
			
		for ( Double d: newlist)
		{
			System.out.println(d+",");
		}
		
		System.out.println(" String ");
		
		for (String m : list)
		{
			System.out.println(m+ " ");
		}*/
		
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.didision\n enter the option:");
		
		//operator=expression.next().charAt(0);
		
		
		option=expression.nextInt();
		
		switch(option)
		{
		case 1: total= add(a,b);
		System.out.println("Addition is" + total);
		break;
		
		case 2: total = substract(a,b);
		System.out.println("Substraction is" + total);
		break;
		
		case 3: total = multiply(a,b);
		System.out.println("Multiplication is" + total);
		break;
		
		
		case 4: total = divide(a,b);
	    System.out.println("Division is" + total);
	    break;
		}	
		
		//System.out.println(a +" "+operator+" "+ b + "="+ total);
		}
		public static double add(double a, double b)
		{
		return a+b;
		}
		
		public static double substract(double a, double b)
		{
		return a-b;
		}
		
		public static double multiply(double a, double b)
		{
		return a*b;
		}
		
		public static double divide(double a, double b)
		{
		return a/b;
		}
		
}


