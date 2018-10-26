package com.test.abc;

import java.util.*;

import java.util.Scanner;

public class Vending {

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
		}
		else if (str.equalsIgnoreCase("5")) {
			System.out.println("not available");
		}

		myMenu();

	}

	public static void myMenu() {
		System.out.println("Hello");
		System.err.println("1.chocolate\n 2.cookies\n 3.chips\n 4.milkshakes\n 5.others\n 6.add an item\n");
		
		System.out.println();
		System.out.println("-----------------------------------");

		option();
	}
}
