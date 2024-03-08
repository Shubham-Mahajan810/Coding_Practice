import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String s = sc.nextLine();
        boolean cheack = true;

        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j))
            cheack = false;
        }
        if(cheack==true)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
