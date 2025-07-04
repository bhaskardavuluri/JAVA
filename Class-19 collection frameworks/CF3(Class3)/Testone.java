//Sorting in arraylist--Arranging the Arraylist either in asecending/Descending order..

import java.util.ArrayList;
import java.util.Collections;  //utility classes have some collections methods by using them we can sort shuffle or search the elements in an array..

public class Testone {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("shravan");
        enames.add("sonia");
        enames.add("amithshah");
        enames.add("modiji");
        System.out.println(enames);
         Collections.sort(enames); 
         System.out.println(enames);
         //reverse order
         Collections.sort(enames,Collections.reverseOrder());
         System.out.println(enames);
    }
}
