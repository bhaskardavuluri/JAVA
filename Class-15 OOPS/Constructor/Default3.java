class Bank{
    String accountholder;
    double setbalance;
    public Bank(){
        accountholder="Unknown";
        setbalance=0.0;
    }
    public void display(){
        System.out.println("Accounholder:"+accountholder);
        System.out.println("Setabalance:"+setbalance);
    }

}
public class Default3{
    public static void main(String[] args) {
        Bank B=new Bank();
        B.display();
    }
}