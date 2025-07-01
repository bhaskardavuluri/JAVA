//compare()-this method is used to compare two arrays 
/* 1)returns 0 if the two arrays are equal.
    2)returns a negative interger if array 1 is less than array2.
    3)returns a positive integer if array1 is greater than array2.
    */

import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        int [] eids={101,102};
        int [] eid={1,2,3};
        System.out.println(Arrays.compare(eids, eid));
    }
}
    
