class one{
    int a;
    one(int a){
        this.a=a;
        System.out.println("constructor is special method");
    }
    public static void main(String[] args) {
        one t1=new one(10);
        one t2=new one(20);
        System.out.println(t1.a);
        System.out.println(t2.a);

    }
}