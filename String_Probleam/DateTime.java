import java.time.LocalDate;
import java.util.Scanner;

/**
 * DateTime
 
public class DateTime {


        
   void Day(int day,int month ,int year ){
        LocalDate local=LocalDate.of(year, month, day);
         System.out.println(local.getDayOfWeek().name());
       //return local.getDayOfWeek().toString();
    }

 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the day");
    int day=sc.nextInt();
    System.out.println("Enter the month");
    int month=sc.nextInt();
    System.out.println("Enter the year");
    int year=sc.nextInt();


    DateTime sp=new DateTime();
      sp.Day(day,month,year);

 }
    
}
*/


public class DateTime {


        
    String Day(int day,int month ,int year ){
         LocalDate local=LocalDate.of(year, month, day);
         // System.out.println(local.getDayOfWeek().name());
        String mm=local.getDayOfWeek().toString();
        return mm;
     }
 
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the day");
     int day=sc.nextInt();
     System.out.println("Enter the month");
     int month=sc.nextInt();
     System.out.println("Enter the year");
     int year=sc.nextInt();
 
 
     DateTime sp=new DateTime();
      String p1= sp.Day(day,month,year);
       System.out.println(p1);
  }
     
 }