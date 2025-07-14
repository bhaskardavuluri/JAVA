//hashset example-duplicates are not allowed and order is not maintained in hashset
//indexing concept is not applicable and we are using for loop,while-loop...etc..
import java.util.HashSet;

public class Test{
    public static void main(String[] args) {
        HashSet eids=new HashSet<>(20,0.75f);  //default :16,0.75F
        eids.add(101);
        eids.add(101);
        eids.add(101);
        eids.add(101);
        eids.add(101);
        eids.add("Rahul");  //order is not maintained in hashset
        System.out.println(eids);//o/p:[101] bcause duplicates are not allowed ..
        //iterating the hashset using for-each
        for (Object object : eids) {
            System.out.println(object);  //we cannot iterate by using for loop..
        }
    }
}