//Hashset methods-There are most common methods for every Set,lists etc..

import java.util.HashSet;

public class Testtwo {
    public static void main(String[] args) {
        HashSet enames=new HashSet<>();
        //add()-adds an element
        enames.add("rahul");
        enames.add("vijay");
        enames.add("babu");
        enames.add("surya");
        enames.add("balayya");
        System.out.println(enames);
        //remove()-removes the specified element from the set..
        enames.remove("balayya");
        System.out.println(enames);
        //contains()-checks and returns boolean values if the element is exists or not..
         System.out.println(enames.contains("vijay"));
         //Sixe()-returns the No of elements present in the set 
         System.out.println(enames.size());
         //isEmpty()-checks and return boolean values if the set is empty or not 
         System.out.println(enames.isEmpty());
         //clear()-removes all the eleemnts from the set
         enames.clear();
         System.out.println(enames);
    }
    
}
