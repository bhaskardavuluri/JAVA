import java.util.ArrayList; //iterating arraylist using for eachh loop

public class Testsix {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        enames.add("amithshah");
        System.out.println(enames);
        //iterating using for-each loop
        for (String string : enames) {
            System.out.println(string);
            
        }
}
}
