

class Company{
    private int empid;

    public void setEmpid(int eid){
        empid=eid;
    }
    public int getEmpid(){
        return empid;

    }
    
    
}
public class Encapsulation {
   

    public static void main(String[] args) {
        Company ob=new Company();
        ob.setEmpid(101);
        System.out.println(ob.getEmpid());
    }
}