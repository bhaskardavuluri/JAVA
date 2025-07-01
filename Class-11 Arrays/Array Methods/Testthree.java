/*The fill() method fills an array with a specified value.

Note: The value must be of the same data type as the array.

Tip: Start and end position can be specified. If not, all elements will be filled. */

import java.util.Arrays;

public class Testthree{
    public static void main(String[] args) {
        int [] eids={101,103,104};
        Arrays.fill(eids,1);
        for (int i : eids) {
            System.out.println(i);
        }
    }
}