

class A{
    void ShowA(){
        System.out.println("Show A");
    }
}
class B extends A{

    void ShowB(){
        System.out.println("show B");
        
    }
}

//this is the Multilevel inheritance A-->B-->Inheritance_Multilevel
public class Inheritance_Multilevel extends B{
    public static void main(String[] args) {
        System.out.println("Main Mathed");
        Inheritance_Multilevel ob=new Inheritance_Multilevel();
        ob.ShowB();
        ob.ShowA();
        B ob1=new B();
        ob1.ShowB();
    }
}
