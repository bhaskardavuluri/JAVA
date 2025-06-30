public class Test4{
    public static void main(String[] args) {
        System.out.println("Gm");
        int[] eids={101,102,103};
        System.out.println(eids[0]);
        try{
            System.out.println(eids[10]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);




        }
        System.out.println(eids[2]);
        System.out.println(eids[2]);
    }
}