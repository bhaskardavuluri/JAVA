//Hashset example program

import java.util.HashSet;

public class Testone {
    public static void main(String[] args) {
        HashSet enames=new HashSet<>();
        enames.add("rahul");
        enames.add("rahul");
        enames.add("rahul");
        enames.add("rahul");
        enames.add("rahul");
        System.out.println(enames); //[rahul]-Duplictaes are not allowed 
    }
    
}
