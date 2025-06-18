class parent{
    int a;
    parent(int a){
        this.a=a;
        System.out.println("parent class constructor");
    }
}
class child extends parent{
    int b;
    child(int a ,int b){
        super(a);
        this.b=b;
        System.out.println("child class constructor");
    }
}
public class Two{   
    
    public static void main(String[] args) {
        child m=new child(10,20);
        System.out.println(m.a);
        System.out.println(m.b);
    }
}                                  //whwn we run this program it will execute both parent and child class.
//the compiler will keep super class in the main method the super class is used to invoke the parent class members..
//whether you place or not the compiler will automatically place the super() class for invoking the parent class 