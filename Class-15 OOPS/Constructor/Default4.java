class Movie{
    String title;
    double Rating;
    public Movie(){
        title="Avatar";
        Rating=8.5;

    }
    public void display(){
        System.out.println("Movie name:"+title);
        System.out.println("Movie Rating:"+ Rating);
    }
}
public class Default4{
    public static void main(String[] args) {
        Movie M=new Movie();
        M.display();
    }
}