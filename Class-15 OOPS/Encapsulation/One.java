

class Student{
    private int age;
    private String name;
    public void setage(int newage){
        this.age=newage;
    }
    public int getage(){
        return age;
    }
    public void setname(String newname){
        this.name=newname;
    }
    public String getname(){
        return name;
    }
}
public class One{
    public static void main(String[] args) {
        Student s=new Student();
       s.setage(21);
        s.getage();
        s.setname("harish");
        s.getname();
        System.out.println("age:"+ s.getage());
        System.out.println("name"+ s.getname());
        
    }
}