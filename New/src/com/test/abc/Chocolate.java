package com.test.abc;

import java.util.Scanner;

public class Chocolate {

	public String [] food = {"1. Dove" ,"2. m&m's", "3.Ferrero"};
	public double[] cost= {1.50,2.75,12};
	
	public void chocolates()
	{
		for(int i=0;i<food.length;i++)
		{
			System.out.println(food[i]);
		
		}
			System.out.println("enter the option");
			Scanner opt= new Scanner(System.in);
			int select= opt.nextInt();
			System.out.println("enter the quantity");
			int number=opt.nextInt();
			System.out.println("amount=" +cost[select-1]*number);
		}
	}
	

