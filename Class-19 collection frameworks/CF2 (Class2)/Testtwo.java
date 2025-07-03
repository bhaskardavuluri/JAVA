import java.util.ArrayList;

public class Testtwo{
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        enames.add("amithshah");
        System.out.println(enames);
        for (String string : enames) {
            System.out.println(string);
        }
        //how to read arraylist elements by using indexing we can use -Getmethod..
        System.out.println(enames.get(0));//name at the place of 0 indexing  value..
        System.out.println(enames.get(1));
        System.out.println(enames.get(2));
        System.out.println(enames.get(3));
        
    }
}