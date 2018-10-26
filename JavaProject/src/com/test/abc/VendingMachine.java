package com.test.abc;

import java.util.Scanner;

import java.util.*;

public class VendingMachine {

	List<String> item = new ArrayList<String>();

	static Scanner product = new Scanner(System.in);

	public static void main(String[] args) {

		myMenu();

	}

	public static void option() {
		System.out.println("enter the option");
		String str = product.nextLine();
		if (str.equalsIgnoreCase("1")) {
			Chocolate ch = new Chocolate();
			ch.chocolates();
		} else if (str.equalsIgnoreCase("2")) {
			Cookies c = new Cookies();
			c.biscuit();
		} else if (str.equalsIgnoreCase("3")) {
			Chips chi = new Chips();
			chi.slice();
		} else if (str.equalsIgnoreCase("4")) {
			Milkshakes milk = new Milkshakes();
			milk.yumm();
		} /*
			 * else if (str.equalsIgnoreCase("5")) { AddanItem ad = new AddanItem();
			 * ad.setName("fruit"); ad.setPrice(3.0); }
			 */
		// else if (str.equalsIgnoreCase("5")) {
		// System.out.println("not available");
		// }

		myMenu();

	}

	public static void myMenu() {
		// System.out.println("Hello");
		System.err.println("1.chocolate\n 2.cookies\n 3.chips\n 4.milkshakes\n 5.Add an item\n");

		System.out.println();
		System.out.println("-----------------------------------");

		option();
	}

	public static class Chocolate {

		public String[] food = { "1. Dove \t 1.50", "2. m&m's \t 2.75", "3.Ferrero \t12" };
		public double[] cost = { 1.50, 2.75, 12 };

		public void chocolates() {
			for (int i = 0; i < food.length; i++) {
				System.out.println(food[i]);

			}
			System.out.println("enter the option");
			Scanner opt = new Scanner(System.in);
			int select = opt.nextInt();
			System.out.println("enter the quantity");
			int number = opt.nextInt();
			System.out.println("amount=" + cost[select - 1] * number);
		}
	}

	public static class Cookies {

		public String[] bite = { "1. Oreo \t 3", "2. Milano \t2", "3. Chocolate Chip \t20" };
		public double[] cost = { 3, 2, 20 };

		public void biscuit() {
			for (int i = 0; i < bite.length; i++) {
				System.out.println(bite[i]);

			}
			System.out.println("enter the option");
			Scanner opt = new Scanner(System.in);
			int select = opt.nextInt();
			System.out.println("enter the quantity");
			int number = opt.nextInt();
			System.out.println("amount=" + cost[select - 1] * number);
		}
	}

	public static class Chips {

		public String[] crunch = { "1. Lays \t 10", "2. Tostitos \t 6.75", "3. Doritos \t 20" };
		public double[] cost = { 10, 6.75, 20 };

		public void slice() {
			for (int i = 0; i < crunch.length; i++) {
				System.out.println(crunch[i]);

			}
			System.out.println("enter the option");
			Scanner opt = new Scanner(System.in);
			int select = opt.nextInt();
			System.out.println("enter the quantity");
			int number = opt.nextInt();
			System.out.println("amount=" + cost[select - 1] * number);
		}
	}

	public static class Milkshakes {
		public String[] gulp = { "1. chocolate \t 7.5", "2. strawberry \t 1", "3. vanilla \t 0" };
		public double[] cost = { 7.5, 1, 0 };

		public void yumm() {
			for (int i = 0; i < gulp.length; i++) {
				System.out.println(gulp[i]);

			}
			System.out.println("enter the option");
			Scanner opt = new Scanner(System.in);
			int select = opt.nextInt();
			System.out.println("enter the quantity");
			int number = opt.nextInt();
			System.out.println("amount=" + cost[select - 1] * number);
		}

		/*
		 * public static class AddanItem {
		 * 
		 * String name;
		 * 
		 * public String getName() { return name; }
		 * 
		 * public void setName(String name) { this.name = name; }
		 * 
		 * double price;
		 * 
		 * public double getPrice() { return price; }
		 * 
		 * public void setPrice(double price) { this.price = price; }
		 * 
		 * }
		 */

	}

}
