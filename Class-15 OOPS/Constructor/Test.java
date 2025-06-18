//constructor:-it is  nothing but a special method at the time of creating objects which used to initialize  the object values
class Account{
    int acc_id;
    String acc_name;
    int acc_bal;
    
    Account(int id,String name,int amount){
        this.acc_id=id;
        this.acc_name=name;
        this.acc_bal=amount;
    }
    public int deposit_Amount(int amount){
       return  this.acc_bal=this.acc_bal+amount;
    }
    
}
public class Test{
    public static void main(String[] args) {
        Account a1=new Account(101,"uday",30000);
        a1.deposit_Amount(2000);
        a1.deposit_Amount(3000);
        System.out.println(a1.acc_id);
        System.out.println(a1.acc_name);
        System.out.println(a1.acc_bal);
        Account a2=new Account(102,"saikrishna",  20000);
        a2.deposit_Amount(5000);
        a2.deposit_Amount(5000);
        System.out.println(a2.acc_id);
        System.out.println(a2.acc_name);
        System.out.println(a2.acc_bal);


        
    }
}