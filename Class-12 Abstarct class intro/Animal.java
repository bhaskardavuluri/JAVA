abstract class Animal{
     abstract void eat();
     public void sleep(){

        System.out.println("sleeping");
     }
}
class Dog extends Animal{
    
        public void eat(){
            System.out.println("it eats biscuits ");
        
    }
}
class Main{
    public static void main(String[] args) {
         Dog t1=new Dog();
         t1.eat();
         t1.sleep();
    }
}