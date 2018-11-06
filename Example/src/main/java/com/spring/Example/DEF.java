package com.spring.Example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class DEF implements MobileProcessor {

	public void Process() {
		
		System.out.println("the 2nd best");

	}

}
