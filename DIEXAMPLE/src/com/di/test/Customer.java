package com.di.test;

public class Customer {

		Service serv= new Service("cool service");
public String viewcustserv() 
{
	System.out.println(serv.getName());
	return serv.getName();
}



}

