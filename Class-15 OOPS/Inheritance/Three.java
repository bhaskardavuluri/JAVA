class Employee{
    String emp_name;
    int emp_salary;
    

    }
    
    
    class Manager extends Employee{
        String department;
        public Manager(String name,int salary ,String departname){
            this.emp_name=name;
            this.emp_salary=salary;
            this.department=departname;
        }
    } 
    public class Three{
        public static void main(String[] args) {
           Manager v= new Manager("Alice", 50000, "HR");
           System.out.println("employeename:"+v.emp_name);
           System.out.println("employee salary:"+ v.emp_salary);
           System.out.println("department:"+ v.department);
        }
    }
    
