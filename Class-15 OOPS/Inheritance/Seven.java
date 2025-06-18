class Person{
    String name;
    int age;
    public void displaypersoninfo(){
        System.out.println("NAME:"+ name);
        System.out.println("AGE:"+ age);
    }
}
class Student extends Person{
    int rollno;
    public void displaystudentinfo(){
        System.out.println("ROLLNO:"+ rollno);
    }
}
class Marks extends Student{
    int subject1,subject2,subject3;
    public void displaystudentmarks(){
        System.out.println("S1 Marks:"+ subject1);
        System.out.println("S2 Marks:"+ subject2);
        System.out.println("S3 Marks:"+ subject3);
    }
    public int calculatetotalmarks(){
        return subject1+subject2+subject3;

    }


}
public class Seven{
    public static void main(String[] args) {
         Marks m=new Marks();
         m.name="saikrishna";
         m.age=21;
         m.rollno=06;
         m.subject1=80;
         m.subject2=95;
         m.subject3=40;
         m.displaypersoninfo();
         m.displaystudentinfo();
         m.displaystudentmarks();
         m.calculatetotalmarks();
         System.out.println("Total marks:"+ m.calculatetotalmarks());
    }
}
