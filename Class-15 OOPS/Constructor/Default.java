class Car{
    String brand;
    int year;
    public Car(){
        brand="MERCEDES";
        year=2021;
    }
    public void display(){
        System.out.println("Car Brand:"+brand);
        System.out.println("Manufactured Year:"+year);
    }
}
public class Default{
    public static void main(String[] args) {
        Car c= new Car();
        c.display();

    }
}
