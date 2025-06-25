class Animal{              //same method name ,same parameters and return type also same ..
    public void sound(){
        System.out.println("make a general sound");  //runtime polymorphism
    }
}
class dog extends Animal{
    public void sound(){
        System.out.println("dog barks");  //overiding the methods it is only possible using inheritance by using extends keyword..
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("cat meows");
    }
}
class lion extends Animal{
    public void sound(){
        System.out.println("lion roars");
    }
}
public class Demo{
    public static void main(String[] args) {
        Animal a;
         a=new dog();
         a.sound();
         a=new Animal();
         a.sound();
         a=new cat();
         a.sound();
         a=new lion();
         a.sound();

    }
}
