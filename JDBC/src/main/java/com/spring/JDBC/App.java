package com.spring.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.JDBC.StudentJDBCTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    	      StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)
    	         context.getBean("studentJDBCTemplate");
    	      
    	      System.out.println("------Records Creation--------" );
    	      studentJDBCTemplate.create("Zara", 11);
    	      studentJDBCTemplate.create("Nuha", 2);
    	      studentJDBCTemplate.create("Ayan", 15);

    	      System.out.println("------Listing Multiple Records--------" );
    	      List<Student> students = studentJDBCTemplate.listStudents();
    	      
    	      for (Student record : students) {
    	         System.out.print("ID : " + record.getId() );
    	         System.out.print(", Name : " + record.getName() );
    	         System.out.println(", Age : " + record.getAge());
    	      }  
    	   }

    }
