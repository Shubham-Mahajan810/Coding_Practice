package cpm.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext con=new ClassPathXmlApplicationContext("cpm/springcore/stereotype/NewFile.xml");
      Student student= con.getBean("student",Student.class);
      System.out.println(student);
	}

}
