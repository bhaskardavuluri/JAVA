//applying arraylist methods to the elements..
import java.util.ArrayList;   
import java.util.Iterator;

public class Test{
    public static void main(String[] args){
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("shravan");
        enames.add("sonia");
        enames.add("amithshah");
        enames.add("modiji");
        System.out.println(enames.size());
        System.out.println(enames.isEmpty());
        System.out.println(enames.contains("rahul"));//True because rahul is availble in the arraylist ..
        System.out.println(enames.contains("rajni"));//Returns false because Rajni is not avaialble in the arraylist..
        //iterating the arraylist by using iterator
    
        Iterator itr=enames.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        //updataing the eleements 
        enames.set(0, "rahulgandhi");//it is used to uodate the values based upon the indexing..
        System.out.println(enames);
        //clear()-this method is used to remove all the elements from the collection
        enames.clear();
        System.out.println(enames);//Removes all the elements in the collection
        //Remove()-this method is used to remove specified the element
        //enames.remove("rahulgandhi");
        //System.out.println(enames);
        //removeAll-
            
        }
    }
