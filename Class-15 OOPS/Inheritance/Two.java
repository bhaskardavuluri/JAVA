class Person{
    String P_name;
    int p_age;
    public void displaydetails(){
        System.out.println("name:"+ P_name);
        System.out.println("age:"+ p_age);
    }
}
class student extends Person{
    String collegename;
    public student(String name,int age ,String clgname){
        this.P_name=name;
        this.p_age=age;
        this.collegename=clgname;

    }
    public void displayalldetails(){
        displayalldetails(); //parent class
        System.out.println("collegename:"+ collegename);
    }
}
public class Two{
    public static void main(String[] args) {
        student s =new student("saikrishna", 23, "sri mittapalli college of engineering");
        System.out.println("name:"+s.P_name);
        System.out.println("age:"+s.p_age);
        System.out.println("collegename:"+s.collegename);
    }
}