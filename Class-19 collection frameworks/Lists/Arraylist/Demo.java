
//example for performing arraylist methods ..
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList <String> enames=new ArrayList<String>();
        enames.add("hi");
        enames.add("hello");
        enames.add("babuu0");
        enames.add("prasad");
        enames.add("chiru");
        enames.add("chirutha"); 
        System.out.println(enames);//[hi,hello,babuuu,prasad,chiru,chirutha]
        enames.add(2, "gud mrng");
        System.out.println(enames);//[hi,hello,Gud mrng,babuuu,prasad,chiru,chirutha]
        //System.out.println(enames.get(7));//error
        enames.set(6, "balayya");
        System.out.println(enames);  //[hi,hello,gud mrng,babuuu,prasad,chiru,balayya]
        enames.remove("hello");
        System.out.println(enames);//[hi,gud mrng,babuuu,prasad,chiru,balayya]
        enames.clear();
        System.out.println(enames);//[]
        System.out.println(enames.contains("balayya"));//false
        System.out.println(enames.size());//0
        System.out.println(enames.isEmpty());//true
    }
}
