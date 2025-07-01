public class Test{
    public static void main(String[] args) {
        int[] eids;  //DECLARATION
        eids=new int[4];
        eids[0]=101;
        //eids[1]="rg"; allowed only homogeneous
        Object[] objs;
        objs=new Object[4];
        objs[0]=101;
        objs[1]="Rahul";
        objs[2]=45000.00;
        objs[3]=true;
        for (Object object : objs) {
            System.out.println(object);
        }

    }
}