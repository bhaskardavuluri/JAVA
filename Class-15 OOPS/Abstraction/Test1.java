abstract class vehicle{
    abstract void start();
    public void fuel(){
        System.out.println("a vehicle can fuel like petrol or diesel");
    }
}
class car extends vehicle{
    public void start(){
        System.out.println("the vehicle starts with a key");
        
    }
}
class bike extends vehicle{
    public void start(){
        System.out.println("the bike starts with an key");
    }
}
public class Test1{
    public static void main(String[] args) {
        bike b=new bike();
        car c= new car();
        b.fuel();
        b.start();
        c.fuel();
        c.start();
    }
    
    
}