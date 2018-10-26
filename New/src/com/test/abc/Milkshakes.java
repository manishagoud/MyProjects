package com.test.abc;

import java.util.Scanner;

public class Milkshakes {
	public String [] gulp = {"1. chocolate" ,"2. strawberry", "3. vanilla"};
	public double[] cost= {7.5,1,0};
	
	public void yumm()
	{
		for(int i=0;i<gulp.length;i++)
		{
			System.out.println(gulp[i]);
	
		}
			System.out.println("enter the option");
			Scanner opt= new Scanner(System.in);
			int select= opt.nextInt();
			System.out.println("enter the quantity");
			int number=opt.nextInt();
			System.out.println("amount=" +cost[select-1]*number);
		}
	}


