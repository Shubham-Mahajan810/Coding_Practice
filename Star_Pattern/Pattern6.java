   /* 
   
     *
    * *
   * * *
  * * * *
 * * * * *
 
*/

public class Pattern6 {
    public static void main(String arge[]){
        for(int i=0;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
