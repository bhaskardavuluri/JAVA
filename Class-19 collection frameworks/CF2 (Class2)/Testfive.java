import java.util.ArrayList;  //iterating the arraylist using do-while loop

public class Testfive {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        enames.add("amithshah");
        System.out.println(enames);
        //iterating using do-while loop
        int i=0;
        do {
            System.out.println(enames.get(i));
            i++;
            
        } while (i<=enames.size()-1);
    
}
}
