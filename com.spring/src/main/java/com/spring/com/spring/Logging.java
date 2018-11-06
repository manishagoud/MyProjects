package com.spring.com.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {

	@Before("execution(* com.spring.com.spring.Student.*(..))")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	@After("execution(* com.spring.com.spring.Student.*(..))")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	@AfterReturning("execution(* com.spring.com.spring.Student.*(..))")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	@AfterThrowing("execution(* com.spring.com.spring.Student.*(..))")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}
