package com.di.test;

public class Customer {

		Service serv;;

		public Customer(Service serv) {
			
			this.serv= serv;
			
		}
		
		
		public String viewcustserv() 
{
	System.out.println(serv.getName());
	return serv.getName();
}



}

