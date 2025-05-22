public class Employee{
    int a=100;
    int b=200;
    public static void main(String[] args) {
       // System.out.println(a);              these two  statements gives compile time error 
        //System.out.println(b);              i.e non static variables cant be assigned to static context.
    }
}