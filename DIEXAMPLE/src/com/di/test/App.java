package com.di.test;

public class App {

	public static void main(String[] args) {
		
		
		Service s = new Service("Good");
		Service s1 = new Service("Dumb");
		Service s2 = new Service("HAHA");
		
		
		Customer cust= new Customer(s);
		Customer cust1= new Customer(s1);
		Customer cust2= new Customer(s2);
		
		cust.viewcustserv();
		cust1.viewcustserv();
		cust2.viewcustserv();
		
	}
}