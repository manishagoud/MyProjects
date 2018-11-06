package com.spring.Example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ABC implements MobileProcessor {

	public void Process() 
	{
		
		System.out.println("the best");
	}

}
