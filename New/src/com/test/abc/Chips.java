package com.test.abc;

import java.util.Scanner;

public class Chips {
	
	public String [] crunch = {"1. Lays" ,"2. Tostitos", "3. Doritos"};
	public double[] cost= {10,6.75,20};
	
	public void slice()
	{
		for(int i=0;i<crunch.length;i++)
		{
			System.out.println(crunch[i]);
	
		}
			System.out.println("enter the option");
			Scanner opt= new Scanner(System.in);
			int select= opt.nextInt();
			System.out.println("enter the quantity");
			int number=opt.nextInt();
			System.out.println("amount=" +cost[select-1]*number);
		}
	}


