//Arraylist example

import java.util.ArrayList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List <String> enames=new ArrayList<String>();
        //add method
        enames.add("balayya");
        enames.add("mahesh babu");
        enames.add("rajinikanth");
        enames.add("durga prasad");
        enames.add("uday");
        enames.add("bhaskar");
        System.out.println(enames);
        //remove method..
        enames.remove(4);
        System.out.println(enames);
        //adding element based upon indexing..
        enames.add(4, "hussain");
        System.out.println(enames);
        //get method-returns the elements with specified index..
        
        System.out.println(enames.get(2));
        //set method -it is used to replace an element with an specifoed index..
        enames.set(0, "jai balayya");
        System.out.println(enames);
        //remove method-removes the element in the specified index..
        enames.remove(3);
        System.out.println(enames);
        //clear method- removes all the elements from the list..
         ///returns the empty list []..
        //remove ---used to remove the duplicates in the same arraylist means containg same name elements..
        // enames.remove);
         
        //contains method- checks the list contains certain element
    
        System.out.println(enames.contains("hussain"));
        //Size method-returns the number of elements in the list...
        System.out.println(enames.size());
        //isempty method -Checks if the list is empty or not..
        System.out.println(enames.isEmpty());

    }

}