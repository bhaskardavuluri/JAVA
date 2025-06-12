 abstract class BankAccount{
    abstract void deposit();
     void withdraw(){
        System.out.println("enter the withdraw amount");
    }
    abstract void getbalance();

}
class Savingsaccount extends BankAccount{
    void deposit(){
        System.out.println(("please enter the depositing amount "));
    }
    void getbalance(){
        System.out.println("your current balanve is 1000 rupess only");
    }
    }

class checkingaccount extends BankAccount{
    void deposit(){
        System.out.println("enter the deposit amount ");
    }
    void getbalance(){
        System.out.println("your current balance is 2000 rupeess");
    }
}
class One{
    public static void main(String[] args) {
       Savingsaccount t1=new Savingsaccount();
       checkingaccount t2=new checkingaccount();
       t1.deposit();
       t1.withdraw();
       t1.getbalance();
       t2.deposit();
       t2.withdraw();
       t2.getbalance();
    }
}