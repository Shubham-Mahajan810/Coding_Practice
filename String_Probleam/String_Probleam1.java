public class String_Probleam1 {
    public static void main(String[] args) {
        String s1="Shubham";
        String s2="Shubham1";
        System.out.println(s1);
        System.out.println(s2);
        if(s1==s2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
  
     System.out.println("************************");
       //The println statement prints false because separate memory is allocated for each string literal. 
       //Thus, two new string objects are created in the memory i.e. str and str1. that holds different references.

        String b =new String(s1).intern();  //<--- intern
        String b1= new String(s2).intern();
        if(b==b1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
