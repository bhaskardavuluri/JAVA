class Book{
    private String title;
    private String author;
    private Double price;
    public void settitle(String newtitle ){
        this.title=newtitle;
    }
    public String gettitle(){
        return title;
    }
    public void setauthor(String newauthor){
        this.author=newauthor;
    }
    public String getauthor(){
        return author;
    }
    public void setprice(Double newprice ){
        this.price=newprice;
    }
    public double getprice(){
        return price;
    }
}
public class Two{
    public static void main(String[] args) {
         Book b=new Book();
         b.settitle("java basics");
         
         b.setauthor("john");
         
         b.setprice(299.99);
         
         System.out.println("book title"+            b.gettitle());
         System.out.println("book author"+            b.getauthor());
         System.out.println("book price"+            b.getprice());

    }
}