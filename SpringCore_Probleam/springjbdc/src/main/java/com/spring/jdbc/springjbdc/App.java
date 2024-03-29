
package com.spring.jdbc.springjbdc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.studentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started...!" );
        ApplicationContext context= 
        		new ClassPathXmlApplicationContext("com/spring/jdbc/springjbdc/Config.xml");
  studentDao student=  context.getBean("studentDaoimple",studentDao.class);
  
  
//       Student obj=new Student();
//       
//       
//       obj.setId(2246);
//       obj.setName("Krishna");
//       obj.setCity("Pune");
//       
//       
//       int r =student.instert(obj);
//       System.out.println(r);
    
  
     //update
//  Student obj=new Student();
//  obj.setId(2246);
//  obj.setName("Krishna");
//  obj.setCity("Erandol");
//  int r =student.change(obj);
//  System.out.println("Change the Data..."+r);
   
  
  //delete
// int r= student.delete(1);
//  System.out.println("Delete the id "+ r);
  
  
  
   Student obj=new Student();
   
  Scanner sc = new Scanner(System.in);
  System.out.println("1:insert\n2:Update\n3:Delete");
  int number=sc.nextInt();
     
   switch(number) {
   
   case 1:
	   
	   System.out.println("Enter the Student id:-");
	   int id=sc.nextInt();
	   obj.setId(id);
	     
	   System.out.println("Enter the Student Name:-");
	   String Name=sc.next();
	   obj.setName(Name);
		  
	   System.out.println("Enter the Student City:-");
	   String City=sc.next();
	   obj.setCity(City);
		  
	   int r =student.instert(obj);
       System.out.println("Data Insert...."+ r);
	  break;
	  
   case 2:
	   System.out.println("Enter the Student id:-");
	   int id1=sc.nextInt();
	   obj.setId(id1);
	      
	   System.out.println("Enter the Student Name:-");
	   String Name1=sc.next();
	   obj.setName(Name1);
			  
	   System.out.println("Enter the Student City:-");
	   String City1=sc.next();
	   obj.setCity(City1);
			  
	   int r1 =student.change(obj);
	   System.out.println("Data Update...."+ r1);
	  break;
	  
   case 3:
	   System.out.println("Enter the Student id:-");
	   int id3=sc.nextInt();
	   int r3= student.delete(id3);
	   System.out.println("Delete the id "+ r3);
	  break;
   
   }
   
    }
}
