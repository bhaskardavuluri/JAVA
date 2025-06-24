class Test extends Object{   //object is a pre defined class for every java classes 
    public static void main(String[] args){
        Test t1=new Test();
        Test t2=new Test();
        String s1="rahul";
        System.out.println(t1.toString());
        System.out.println(t1);
        System.out.println(t1.equals(t2));   // object  class  equals method is used for reference comparision of objects..
        System.out.println(t1==t2);//equal  operator is used for content   comparision of objects..
        System.out.println(s1);     
        System.out.println(t1.equals(s1));  
        
    }



}