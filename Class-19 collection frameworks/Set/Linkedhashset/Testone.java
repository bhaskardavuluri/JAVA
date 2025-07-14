import java.util.LinkedHashSet;

public class Testone {
    public static void main(String[] args) {
        LinkedHashSet enames=new LinkedHashSet<>();
        enames.add("bhaskar");
        enames.add("jay");
        enames.add("prasad");
        enames.add("chiru");
        System.out.println(enames); //insertion order is maintained..\
        enames.add("chiru");//duplicates are not allowed..
        System.out.println(enames);
        

    }
}
