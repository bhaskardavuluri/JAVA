//Linked List-use the linkedlist at the time of performing operations like insertion/Deletion the elements it is more computational..
//ArrayList-use the arraylist for retrieving the more data /..it is less computational..
//linkedList example..

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List<Integer> num=new LinkedList<Integer>(Arrays.asList(70,80,18,7)); 
            // num.add(101);
            // num.add(102);
            // num.add(103);
            // num.add(104);
            System.out.println(num);
            //Iterating the LinkedList using for-Loop,while-loop,do-while,for each,...
            for (Integer integer : num) {
                System.out.println(integer);//for-each
            }
            int i=0;
            while (i<=num.size()-1) {
                System.out.println(num.get(i));   //using while loop..
                i++;
                
            }
            System.out.println("#################");
            Iterator itr=num.iterator();
            while (itr.hasNext()) {                     //Using Iterator() method
                System.out.println(itr.next());
                
            }
            System.out.println("****************");
            //How to sort the LinkedList-using sort.Linkedlist()
            Collections.sort(num);
             System.out.println(num);
             //reversed order.
             System.out.println("*********");
             Collections.sort(num.reversed());
             System.out.println(num);
            
        
    }
}

