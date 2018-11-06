package com.spring.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext company = new AnnotationConfigApplicationContext(Iphone.class);
    	
        Iphone IP= company.getBean(Iphone.class);
        
        IP.config();
    }
}
