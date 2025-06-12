 interface Dao {
    void login();
    void logout();

    
}
class Daoimpl implements Dao{
    public void login(){
        System.out.println("LOGIN SUCCESSFULLY");
    }
    public void logout(){
        System.out.println("LOGOUT SUCCESSFULLY");
    }
}
class Demo{
    public static void main(String[] args) {
      Dao  obj=new Daoimpl();
      obj.login();
      obj.logout();
    }

}