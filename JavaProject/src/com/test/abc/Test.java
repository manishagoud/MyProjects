package com.test.abc;

import java.util.*;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String code = null;
		
		Scanner a= new Scanner(System.in);
		
		System.out.println("enter the line");;
		
		String s= a.nextLine();
		
		List<String> List= new ArrayList<String>();
		
		List<Integer> newlist = new ArrayList<Integer>();
	
		String[] yes =s.split(" ");
		
		for(String str : yes)
		{
        
			try
			{
			
				newlist.add(Integer.parseInt(str));
			
			}
			catch (NumberFormatException e) {
				
				List.add(str);
			
			}
		for (String d : yes)
			System.out.println();
		}
	}

}
