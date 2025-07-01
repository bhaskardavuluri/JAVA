class Testsix{
    public static void main(String[] args) throws ClassCastException {
       /*  String st=new String("rahul");
        Object obj=(Object)st;                  //we can convert String to object easily but we cant covert object to string easily 
        System.out.println(obj);*/              //sop we are using classcastexception...
        Object obj1=new Object();
        String st1=(String)obj1;    //classcastException    
}
}