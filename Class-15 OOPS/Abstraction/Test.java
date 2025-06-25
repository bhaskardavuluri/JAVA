abstract class vehicle{
    abstract void start();
    public void fuel(){
        System.out.println("petrol or diesel");
    }
}
class car extends vehicle{
    public void start(){
        System.out.println("a car can be started with a key");
    }
}
public class Test{
    public static void main(String[] args) {
        car c=new car();
        c.start();
        c.fuel();
    }
}