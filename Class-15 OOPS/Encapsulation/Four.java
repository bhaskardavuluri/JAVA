class Employee {
    private String name;
    private double monthlySalary;

    // Setters and getters
    // Method: double getYearlySalary() → returns monthlySalary * 12
    public void setname(String newname){
        this.name=newname;

    }
    public String getname(){
        return name;
    }
    public void setmonthlysalary(double newsalary){
        this.monthlySalary=newsalary;
    }
    public double getYearlySalary(){

        return monthlySalary*12;
    }
}
public class Four{
    public static void main(String[] args) {
        Employee s=new Employee();
        s.setname("subbarao");
        s.setmonthlysalary(75000);
        System.out.println("Employeename:"+ s.getname());
        System.out.println("yearlysalary:"+s.getYearlySalary());
    }
}