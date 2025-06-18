class Person{
    String name;
    int age;
    public void displayPersoninfo(){
        System.out.println("name:"+ name);
        System.out.println("age:"+ age);
    }
}
class Employee extends Person{
    int empid;
    public void displayempinfo(){
        System.out.println("empid:"+empid);
    }
}
class Manager extends Employee{
    String department;
    public void displaymanagerinfo(){
        System.out.println("department:"+ department);
    }
}
public class Six{
    public static void main(String[] args) {
         Manager M =new Manager();
         M.name="saikrishna";
         M.age=21;
         M.empid=420;
         M.department="HUMAN RESOURCES";
         M.displayPersoninfo();
         M.displayempinfo();
         M.displaymanagerinfo();

    }
}