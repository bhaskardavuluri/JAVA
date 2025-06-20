class Laptop{
    String model;
    int ram;
    int storage;
    public Laptop(){
        model="HP";
        ram=8;
        storage=512;
    }
    public void display(){
        System.out.println("Mode:"+model);
        System.out.println("RAM:"+ ram);
        System.out.println("storage:"+ storage);
    }
}
public class Default2{
    public static void main(String[] args) {
         Laptop L=new Laptop();
         L.display();
    }
}