abstract class Animal{
    abstract void makesound();
    
}
class Dog extends Animal{
    public void makesound(){
        System.out.println("a dog can barks");
    }
}
class cat extends Animal{
    public void makesound(){
        System.out.println("a cat can make sound as meow ");
    }
}
public class Demo{
    public static void main(String[] args) {
        Dog d=new Dog();
    d.makesound();
        cat c=new cat();
        c.makesound();
    }
    
}