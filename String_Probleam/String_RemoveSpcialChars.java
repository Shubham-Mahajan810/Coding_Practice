import java.util.Scanner;

public class String_RemoveSpcialChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sh=sc.nextLine();
       
    //Approach_1
        String sh2=sh.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(sh2);

    //Approach_2
    //Removes the spaces .not a spcialcharster...
    String sg=sh.replaceAll("\\s", "");
    System.out.println(sg);
    }
}
