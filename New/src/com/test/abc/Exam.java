package com.test.abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// double a;
		// double b;
		// char operator;
		// double total=0.0;

		Scanner expression = new Scanner(System.in);

		System.out.println("enter");

		String s = expression.nextLine();

		List<String> list = new ArrayList<String>();
		List<Double> newlist = new ArrayList<Double>();

		String[] Apple = s.split(" ");

		for (String str : Apple) {

			try {
				newlist.add(Double.parseDouble(str));
			} catch (NumberFormatException e) {
				list.add(str);
			}
		}

		//System.out.println("Numbers");

		for (Double d : newlist) {
			//System.out.print(+d + ",");
		}

		//System.out.println(" String ");

		for (String m : list) {
			//System.out.print(m + " ");
			// System.out.println("happy face");
		}
		/*Calculate c = new Calculate();
		if(m == "add" || m== "Add")
		{
			c.add(newlist);
		}
		else if (m == "subtract")*/
		Sorting(list,newlist);

		/*Calculate c = new Calculate();
		c.add(newlist);
		c.substract(newlist);
		c.multiply(newlist);
		c.divide(newlist);*/

	}
	
	public static void Sorting(List<String> list, List<Double> newlist )
		 
		  {
		  
		  Calculate c = new Calculate(); 
		  
		  for(int i=0;i<list.size();i++)
		  {
			  if( (list.get(i).equalsIgnoreCase("Add")) || (list.get(i).equalsIgnoreCase("Addition")) || (list.get(i).equalsIgnoreCase("+")))
			  {		  
				  c.add(newlist);
			  }
			  else if ((list.get(i).equalsIgnoreCase("subtraction")) || (list.get(i).equalsIgnoreCase("substract")) || (list.get(i).equalsIgnoreCase("-")))
			  {
				  c.substract(newlist);
			  }
			  else if ((list.get(i).equalsIgnoreCase("multiply")) || (list.get(i).equalsIgnoreCase("Multiplication")) || (list.get(i).equalsIgnoreCase("*")))
			  {
				  c.multiply(newlist);
			  }
			  else if ((list.get(i).equalsIgnoreCase("divide")) || (list.get(i).equalsIgnoreCase("Division")))
			  {
				  c.divide(newlist);
			  }
				  
		  }
		  
		 /*else if (list.get(i)=="sub"||list.get(i)=="-" || list.get(i)=="Substraction"
		 || list.get(i)=="minus" ||list.get(i)=="difference") 
		 {
		 
		  c.substract(newlist);
		 
		  }
		 else if (list.get(i)=="multiply"||list.get(i)=="*" ||
		  list.get(i)=="Multiplication" || list.get(i)=="product")
		 {
		  
		 c.multiply(newlist); 
		 
		  } 
		 /* else if (list.get(i)=="divide" || list.get(i)=="/" ||
		 list.get(i)=="divivsion") { c.divide(newlist); } }
		 */

	}
}
