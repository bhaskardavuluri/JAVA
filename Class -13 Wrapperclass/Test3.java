public class Test3 {
    public static void main(String[] args) {
        int a=100;
        Integer b=200;
        String c="300";
        
        //Object to Primitive
        //int f=b.intValue();
        int f=b;//Unboxing
        System.out.println(f);
        
        //String Type to Primitive DT
        int e = Integer.parseInt(c);
        System.out.println(e);
        
         //Auto Boxing - Premitive DT to Object
        Integer d=a;
       // Integer d=Integer.valueOf(a);
        System.out.println(d); 
    }
}