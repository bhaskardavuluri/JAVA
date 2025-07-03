//iterating the arrayloist elements by using for-loop,while loop,do-while loop,for each loop..

import java.util.ArrayList;

public class Testthree{
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyanka");
        enames.add("amithshah");
        System.out.println(enames);
        //using for loop to iterate the arraylist elements 
                for(int i=0;i<enames.size();i++){
                    System.out.println(enames.get(i));
                }
                
                    
                }
    }
