class  Test1 extends Object{
    public String  toString(){    
        return "RJ";      //we are overiding the tostring method and giving our return value ..
                
        }
    
     public static void main(String[] args) {
         Test1 t1 =new Test1();
         System.out.println(t1.toString());
         System.out.println(t1);
     }
}