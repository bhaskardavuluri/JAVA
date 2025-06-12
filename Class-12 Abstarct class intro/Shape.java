 abstract class Shape {
    abstract void getarea();
    abstract void getperimeter();
}
class Rectangle extends Shape{
    void getarea(){
        System.out.println("area of the rectangle");

    }
        void getperimeter(){
            System.out.println("perimeter of the rectangle");
        }
    }
class Circle extends Shape{
    void getarea(){
        System.out.println("area of circle");
    }
    void getperimeter(){
        System.out.println("perimeter of circle");
    }

}
 class Test{
    public static void main(String[] args) {
    Rectangle  t1 =  new Rectangle();
    // Circle t2= new Circle();
    t1.getarea();
    t1.getperimeter();
    Circle t2=new Circle();
    t2.getarea();
    t2.getperimeter();
        
    }
}
 