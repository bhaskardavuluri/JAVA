public class One{
    public static void main(String[] args) {
        for (int i=0;i<=2;i++){
            System.out.println("inner"+ i);
            for(int j=0;j<=10;j++){
                System.out.println("outer"+j);
            }
        }
    }
}