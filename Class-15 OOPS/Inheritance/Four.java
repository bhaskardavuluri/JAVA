class grandparent{
    void speak(){
        System.out.println("hello this is grandparent class");
    }
}
class parent extends grandparent{
    void display(){
        System.out.println("hello this is parent class ");
    }
}
class child extends parent{
    void show(){
        System.out.println("hello this is child class ");
    }
}
class son extends child{
    void hello(){
        System.out.println("hello this is grandson class ");
    }
}
public class Four{
    public static void main(String[] args) {
        
          son c=new son();
          c.speak();
          c.display();
          c.show();
          c.hello();
    }
}