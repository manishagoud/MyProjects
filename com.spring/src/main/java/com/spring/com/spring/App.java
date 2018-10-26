package com.spring.com.spring;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

     ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
      Student student = (Student) ( (AbstractApplicationContext) context).getBean("student");
      student.getName();
      student.getAge();
      student.printThrowException();
     
    }
}
