public class Test2{
    int acc_id;
    String acc_name;
    int acc_bal;
    public Test2(int id,String name,int amount){
        this.acc_id=id;
        this.acc_name=name;
        this.acc_bal=amount;

    }
    public int deposit_amount(int amount){
        return this.acc_bal=acc_bal+amount;
        

    }
    public static void main(String[] args) {
        Test2 t=new Test2(101, "Sharavan",10000);
        t.deposit_amount(5000);
        System.out.println(t.acc_id);
        System.out.println(t.acc_name);
        System.out.println(t.acc_bal);

    }
}
