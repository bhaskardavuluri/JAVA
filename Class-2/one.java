//variables concept
/*public class one{
    int a=100;
    public static void main(String[] args){
        System.out.println(a);
}} */
    
 /*  for the above code  their is a error occuring compile time i.e non-static variable a cannot be referenced from a static context
        System.out.println(a);  */
public class one{
    public static void main(String[] args){
        int a=100;
        System.out.println(a);
    }
}