package com.springcore.initDes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/initDes/initDes.xml");
//     initDes s1=(initDes) context.getBean("s1");
//      System.out.println(s1);
      
      Example example=(Example) context.getBean("example");
      System.out.println(example);
      context.registerShutdownHook();
	}

}
