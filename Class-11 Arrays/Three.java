public class Three {
    public static void main(String[] args) {
        int[] Rollnum={11,12,13,14,15};
        // System.out.println(Rollnum);
        Rollnum[4]=16;
        System.out.println(Rollnum.length);
        
        for( int Rollnos: Rollnum){
            System.out.println(Rollnos);
        }
        
    }
}
