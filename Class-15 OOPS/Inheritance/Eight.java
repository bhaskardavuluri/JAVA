class Account{
    String acc_name;
    String acc_email;
    Account(String name,String email){
        this.acc_name=name;
        this.acc_email=email;
        }
}
class SA extends Account{
    int acc_id;
    double acc_bal;
    static double min_bal=500.00;
    SA(int id,String name,String email,double amount){
          super(name,email);
          this.acc_id=id;
          this.acc_bal=amount;
          

    }
    public void display(){
        System.out.println(min_bal);
    }
    

}
public class Eight{
    public static void main(String[] args) {
       SA S1 =new SA(101,"RG","rg@gamil.com",5000.00);
       SA S2 =new SA(102,"SG","sg@gmail.com",10000.00);
       System.out.println(S1.acc_id);
       System.out.println(S1.acc_name);
       System.out.println(S1.acc_email);
       System.out.println(S1.acc_bal);
       S1.display();
       System.out.println(S2.acc_id);
       System.out.println(S2.acc_name);
       System.out.println(S2.acc_email);
       System.out.println(S2.acc_bal);
       S2.display();
       
    }
}