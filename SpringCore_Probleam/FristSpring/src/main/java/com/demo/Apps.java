package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apps {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		Student student55=(Student)context.getBean("student1");
        System.out.println(student55);
	}

}
