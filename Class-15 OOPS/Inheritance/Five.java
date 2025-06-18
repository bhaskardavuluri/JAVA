class Animal{
    public void eat(){
        System.out.println("this animal eats grass");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("this dog barks more louder than any other dog");
    }
}
class Puppy extends Dog{
    public void baby(){
        System.out.println("this puppy is an new born baby");
    }
}
public class Five{
    public static void main(String[] args) {
      Puppy p=  new Puppy();
      p.eat();
      p.bark();
      p.baby();
    }
}