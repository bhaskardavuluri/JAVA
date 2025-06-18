class Car {
    private String brand;
    private String model;
    private int year;

    public void setbrand(String newbrand){
        this.brand=newbrand;
    }
    public String getbrand(){
        return brand;
    }
    public void setmodel(String newmodel){
        this.model=newmodel;

    }
    public String getmodel(){
        return model;
    }
    public void setyear(int manufacturedyear){
        this.year=manufacturedyear;
    }
    public int getyear(){
        return year;
    }
}
public class Three{
    public static void main(String[] args) {
        Car c=new Car();
       
        c.setmodel("toyota ");
        c.setbrand("camry");
        c.setyear(2020);
        System.out.println("car brand:"+  c.getbrand()    );
        System.out.println("car model:"+c.getmodel());
        System.out.println("manufactured year:"+ c.getyear());
    }
}
