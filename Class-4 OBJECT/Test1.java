public class Test1{
    int a=100;
    int b=200;
    static int c=300;

    public static void main(String[] args){
         Test1 t1=new Test1();
         System.out.println(t1.a+t1.b+c);
         Test1 t2=new Test1();
         System.out.println(t2.a+t2.b+ Test1.c);
         t1.a=11;
         System.out.println(t1.a+t1.b+c);


    }
}  //accesing variables using class name ,obj name,using directly for static variables
    //accesing variables using only object names is applicanle for instance variables....
