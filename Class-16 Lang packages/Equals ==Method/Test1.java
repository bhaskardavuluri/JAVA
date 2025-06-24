//object class equals method is used for reference comparison ..
//string class equals() method is used for content comparision..
//string class equals method example.
class Test1{
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        Test1 t1=new Test1();
        Test1 t2=new Test1();
        String s1=new String("rahul");
        String s2="rahul";
        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2)); //it is for reference  comparision.
        System.out.println(t1==t2);
        System.out.println(s1==s2);  // equals operator  is used for content comparision
        System.out.println(a==c);
        System.out.println(a==b);
    }
}