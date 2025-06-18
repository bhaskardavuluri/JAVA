class parent{
    public void display(){
        System.out.println("this is a parent class");
    }
    public void show(){
        System.out.println("this is a child class");
    }
}
public class Sample{
    public static void main(String[] args) {
        parent I=new parent();
        I.display();
        I.show();
    }
}