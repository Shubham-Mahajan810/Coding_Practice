
/*
    *
   ***
  *****
 *******
*********

*/

public class Pattern7 {
    public static void main(String arge[]){
        for(int i=1;i<=5;i++){

            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
               System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
           }
           System.out.println();
        }
        
    }
}


// 


/* 
public static void main(String arge[]){
    for(int i=1;i<=5;i++){
        for(int k=5;k>=i;k--){
            System.out.print(" ");
        }
        for(int j=1;j<(i*2);j++){
            System.out.print("*");
        }
       System.out.println();
      
    }
    
}

*/