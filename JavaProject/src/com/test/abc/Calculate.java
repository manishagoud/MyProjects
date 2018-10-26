package com.test.abc;

import java.util.*;

public class Calculate {

	void add(List<Double> arr) {
		double ans = 0;
		for (int i = 0; i < arr.size(); i++) {
			ans = ans + arr.get(i);
		}
		System.out.println(ans);
	}

	void substract(List<Double> arr) {
		double ans = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (i==0)
			{
				ans=arr.get(0);
				continue;
			}
				ans = ans - arr.get(i);
		}
		System.out.println(ans);
	}


	
	  void multiply(List<Double> arr) 
	  { 
		  double ans=0; 
		  for( int i=0;i<arr.size();i++) 
		  { 
			  if (i==0)
				{
					ans=arr.get(0);
					continue;
				}
					ans = ans * arr.get(i);
		  }
		  
		  System.out.println(ans); 
			  
	      }
	  
	  void divide(List<Double> arr) 
	  {
		  double ans=0; 
		  
		  for( int i=0;i<arr.size();i++)
	  { 
			  if (i==0)
				{
					ans=arr.get(0);
					continue;
				}
					ans = ans / arr.get(i);
			}
		
		  System.out.println(ans);
	  }  
		  }
	 

