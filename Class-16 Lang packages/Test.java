class  Test extends Object{    //by defaulot object is the parent class which consists of total 11 methods inside in it ..
    //wheather we extends or not all the java classes  by default take the object as a parent class..
    
     public static void main(String[] args) {
         Test t1 =new Test();
         System.out.println(t1.toString());    //in obj cparent class the tostring() method returns the address of the obj thats why it is printing like that ..
         System.out.println(t1);
     }
}