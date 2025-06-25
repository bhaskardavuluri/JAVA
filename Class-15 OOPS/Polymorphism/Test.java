class calculator{            //this is called method overloading :multiple methods in same class with same name with diffrent parameters.
    public int add(int a,int b){
        return a+b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public int add(int a ,int b,int c){
        return a+b+c;
    }    
}
public class Test{
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.mul(10, 20));
    }

}