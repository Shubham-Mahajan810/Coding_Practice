/**
 * I1
 */
 interface I1 {
   void show();
    
}

public class TestInterface implements I1 {

    public void show(){
        System.out.println("Hello Test");
        }
    public static void main(String[] args) {
          TestInterface ob=new TestInterface();
          ob.show();
    }

}
