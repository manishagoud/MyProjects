package com.test.abc;

import java.util.Scanner;

public class Cookies {

		public String [] bite = {"1. Oreo" ,"2. Milano", "3. Chocolate Chip"};
		public double[] cost= {3,2,20};
		
		public void biscuit()
		{
			for(int i=0;i<bite.length;i++)
			{
				System.out.println(bite[i]);
		
			}
				System.out.println("enter the option");
				Scanner opt= new Scanner(System.in);
				int select= opt.nextInt();
				System.out.println("enter the quantity");
				int number=opt.nextInt();
				System.out.println("amount=" +cost[select-1]*number);
			}
		}
		





