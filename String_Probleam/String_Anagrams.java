import java.util.Scanner;

public class String_Anagrams {

    private static boolean String_Anagrams(String string1,String string2){
        int count[] = new int[256];
        for(int i=0;i<string1.length();i++){
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if (count[i]!=0) {
                return false;
            }
         return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String obj1=sc.nextLine();
        System.out.println("Enter the String");
        String obj=sc.nextLine();


        System.out.println(String_Anagrams(obj,obj1));
    }
}
