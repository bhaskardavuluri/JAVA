//linkedhashset:-diplicates are not allowed and order is maintained in linkedhashset..

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet eids=new LinkedHashSet(20,0.75f);
        eids.add(101);
        eids.add("rahul"); //order is going to be maintained in Linkedhashset...
        System.out.println(eids);//o/p:-[101,rahul]....
        for (Object object : eids) {
            System.out.println(object);
        }
          
         }
}
