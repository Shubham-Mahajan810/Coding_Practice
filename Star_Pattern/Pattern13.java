/*
 *       *
  *     *
   *   *
    * *
     *
    * *
   *   *
  *     *
 *       *
 
*/


public class Pattern13 {
    public static void main(String ager[]){
        /* 
        for(int i=5;i>=1;i--){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++){
                if(j>1 && j<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i=2;i<=5;i++){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++){

                if(j>1 && j<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
           System.out.println();
          
        }

        */




     /*

      *   *
       * *
        *
       * *
      *   *
      
     */



        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){
                if(i==j || i+j==5-1){
                
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
              
            }
            
            System.out.println();
        }
        
    }
}
