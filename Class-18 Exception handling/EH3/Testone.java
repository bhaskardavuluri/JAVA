import java.io.*;
import java.io.PrintWriter;
public class Testone{
    public static void main(String[] args) {
        System.out.println("gm");
        try {
        PrintWriter pw=new PrintWriter("abc.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}