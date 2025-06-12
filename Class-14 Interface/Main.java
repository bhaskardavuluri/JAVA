 abstract class A{}
 abstract class Dao{
    int login(){
        return 1;
    }
  public  abstract boolean forgetpwd();
 }
 class Daoimpl extends Dao{
    public boolean forgetpwd(){
        return true;
    }
 }
 public class Main{
    public static void main(String[] args) {
        Daoimpl obj=new Daoimpl();
        System.out.println(obj.login());
        System.out.println(obj.forgetpwd());
    }
 }