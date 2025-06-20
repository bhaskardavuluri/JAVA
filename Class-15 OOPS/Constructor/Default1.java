class Mobile{
    String brand;
    int price;
    public Mobile(){
        brand="Samsung";
        price=15000;
    }
    public void showdetails(){
        System.out.println("Brand:"+ brand);
        System.out.println("Price:"+price);
    }

}
public class Default1{
    public static void main(String[] args) {
       Mobile m=new Mobile();
       m.showdetails();
    }
}
