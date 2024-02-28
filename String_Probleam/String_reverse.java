import java.util.Scanner;

public class String_reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

      //Approach-1

        char [] strings = s.toCharArray();

        for(int i = strings.length-1;i>=0;i--){
          System.out.print(strings[i]);
        }
        System.out.println(" ");
       
      //Approach_2
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println(" ");
        

      //Approach_3
        StringBuffer st = new StringBuffer(s);
        System.out.print(st.reverse());
        System.out.println(" ");

      //Approach_4
        StringBuilder builder =new StringBuilder(s);
        System.out.print(builder.reverse());
    }
}