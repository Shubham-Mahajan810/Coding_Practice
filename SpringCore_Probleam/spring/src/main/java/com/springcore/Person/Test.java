package com.springcore.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]arge) {
	
 ApplicationContext context  =new ClassPathXmlApplicationContext("com/springcore/Person/persone.xml");
 Persone p=(Persone)context.getBean("Persone");
      System.out.println(p);
	}
}
