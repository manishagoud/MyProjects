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
//      Student student = new Student();
//      student.setName("zara");
//      student.setAge(11);
      student.getName();
      student.getAge();
      student.printThrowException();
     
    }
}
