abstract class Geometricfigure {
    abstract void calculatearea();
    abstract void calculateperimeter();
}
class Circle extends Geometricfigure{
    void calculatearea(){
        System.out.println("the area of circle is pi^2");
    }
    void calculateperimeter(){
        System.out.println("the perimeter of the circle is 2PIR");
    }
}
class Rectangle extends Geometricfigure{
    void calculatearea(){
        System.out.println("the area of rectangle is A=L*W");
    }
    void calculateperimeter(){
        System.out.println("the perimeter of the rectangle is (L+W)*2");
        }
}
class Triangle extends Geometricfigure{
    void calculatearea(){
        System.out.println("the area of triangle is 1/2 B*H");
    }
    void calculateperimeter(){
        System.out.println("the perimeter of the triangle is A+B+C");
    }

}
class  Two{ 
    public static void main(String[] args) {
         Circle t1= new Circle();
    Rectangle t2=new Rectangle();
    Triangle t3=new Triangle();
    t1.calculatearea();
    t1.calculateperimeter();
    t2.calculatearea();
    t2.calculateperimeter();
    t3.calculatearea();
    t3.calculateperimeter();

        
    }
   

}