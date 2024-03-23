package com.springcore.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
		ApplicationContext context= new ClassPathXmlApplicationContext("NewFile.xml");
		Student student1=(Student) context.getBean("student1");//create the object
        System.out.println(student1);//print the 
        
    }
}
