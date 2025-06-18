class Employee{
    private int eid;
    private String ename;
    public void setEid(int eid){
        this.eid=eid;
    }
    public int getEid(){
        return eid;

    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public String getEname(){
        return ename;

    
        

    }


public class D{
    public static void main(String[] args) {
       Employee e1= new Employee();
        Employee e2=new Employee();
        e1.getEid();
        e2.getEid();
        e1.getEname();
        e2.getEname();
       
    }
}
}