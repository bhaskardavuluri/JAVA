class Gp{
    public void m1(){
        System.out.println("hey this is Gp");
    }
    public void m2(){
        System.out.println("hey this is GP2");
    }

}
class parent extends Gp{
    public void m3(){
        System.out.println("hey this is parent class");
    }

}
class child extends parent{
    public void m4(){
        System.out.println("hey this is child class ");
    }

}
public class One{
    public static void main(String[] args) {
        Gp g1= new Gp();
        g1.m1();
        g1.m2();
        parent p1=new parent();
        p1.m1();
        p1.m2();
        p1.m3();
    child c1=new child();
    c1.m1();

        
    }
}