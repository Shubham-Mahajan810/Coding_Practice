/*

 *********
  *******
   *****
    ***
     *
     
     */

public class Pattern8 {
    public static void main(String arge[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            for(int s=5;s>=i;s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
