//Linkedhashset Methods:

import java.util.LinkedHashSet;

public class Testtwo {
    public static void main(String[] args) {
        LinkedHashSet eids=new LinkedHashSet<>();
        //add()-adds an element to the set
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        eids.add(105);
        System.out.println(eids);
        //remove()-removes the specified element from the set
        eids.remove(101);
        System.out.println(eids);
        //contains()-checks and returns boolean value if the set is containing the value..
        System.out.println(eids.contains(104));
        //sixe()-returns the no of elements in the set
        System.out.println(eids.size());
        //isEmpty()-checks wheather the set is empty or not 
        System.out.println(eids.isEmpty());
        //clear()-it is used to remove all the elements from the set
        eids.clear();
        System.out.println(eids);
    }
}
