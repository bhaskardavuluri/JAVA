import java.util.ArrayList;   //iterrating yhe arraylist by using while loop

public class Testfour{
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        enames.add("amithshah");
        System.out.println(enames);
        //iterating by using while loop
        int i=0;
        while (i<=enames.size()-1) {
            System.out.println(enames.get(i));
            i++;
            
        }
         
       
    }
}