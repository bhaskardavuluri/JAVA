import java.util.LinkedList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List <String> fruits=new LinkedList<String>();
        //add method-adds the elements at the end of the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("papaya");
        fruits.add("orange");
        System.out.println(fruits);
        //addFirst method- adds the element at the starting position
        fruits.addFirst("guava");
        //addLast method- adds the elemen t the last of the list/\..
        fruits.addLast("pineapple");
        System.out.println(fruits);
        //get method -returns the element based upon specified index..
        System.out.println(fruits.get(2));
        //getFirst method- returns the fiest element in the list..
        //getLLast method=returns the last elements in the lisf
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
        //remove method-removes the element based upon specified index..
        System.out.println(fruits.remove(2));
        //removeFirst-removes the first element in the list
        fruits.removeFirst();
        System.out.println(fruits);
        //removeLast-reoves the last element in the index..
        fruits.removeLast();
        System.out.println(fruits);
        //clear- clears all the elemensts in the list and keep it as empty list..
        fruits.clear();
        System.out.println(fruits);
        //contains -it checks wheather the elements exists or not 
        System.out.println(fruits.contains("apple"));
        //size - returns the no of elements in the list..
        System.out.println(fruits.size());

    }
}