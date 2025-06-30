public class Testtwo {
    public static void main(String[] args) {
        
        String ename="Rahul";
        System.out.println(ename.length());
        try{
              String ename2=null;
              System.out.println(ename2.length());

        }
        catch(NullPointerException ae){
            System.out.println(ae.getMessage());
        }
      
    }
}