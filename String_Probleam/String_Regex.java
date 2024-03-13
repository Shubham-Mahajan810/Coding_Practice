import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Regex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Password:-");
        String ob=sc.nextLine();
        
        Pattern pattern=Pattern.compile("Shubham@123");
        Matcher macher=pattern.matcher(ob);
        if (macher.matches()) {
            System.out.println("Pattern mached Successfully");
        }else{
            System.out.println("Invalid input");
        }
    }
}
