import java.io.*;
import java.io.PrintWriter;
public class Testtwo{
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("abc.txt");
        System.out.println(pw);
    }
}