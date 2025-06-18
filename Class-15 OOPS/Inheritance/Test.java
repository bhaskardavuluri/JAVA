class Parent{
public void m1(){
    System.out.println("parent class 1");
}
public void m2(){
    System.out.println("parent class 2");
}
}
 class Child extends Parent{
    public void m3(){
        System.out.println("child class");
    }

}
public class Test{
    public static void main(String[] args) {
            Parent p1=new Parent();
            p1.m1();
            p1.m2();
            Child c1=new Child();
            c1.m1();
            c1.m2();
            c1.m3();
            


        
    }
} 