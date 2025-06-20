class Student{
    String name;
    int age ;
    int Rollno;
    public Student(String n ,int a,int r){
        name=n;
        age=a;
        Rollno=r;


    }
    public void display(){
        System.out.println("Student Name:"+name);
        System.out.println("Student age :"+ age);
        System.out.println("Student rollno:"+ Rollno);
    }
}
public class Paramet{
    public static void main(String[] args) {
         Student s=new Student("Uday", 23, 14);
         s.display();
    }
    
}