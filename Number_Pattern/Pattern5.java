public class Pattern5 {
    public static void main (String agre[]){
        
        for(int i=1;i<=5;i++){
            int no=i;
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no=no+5-j;
            }
            System.out.println();
        }
    }
}
