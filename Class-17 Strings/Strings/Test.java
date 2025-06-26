public class Test{
    public static void main(String[] args) {
        String ename=("rahul");      //Example for why strings are  immutable.. like why they are cant able to change once the object is created.. 
       ename= ename.concat("gandhi");
        System.out.println(ename);
    }
} 