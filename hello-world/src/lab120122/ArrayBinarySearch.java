package lab120122;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        String[] names = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
        Arrays.sort(names);
        System.out.println("Mary is at " + Arrays.binarySearch(names, "Mary"));

    }
}
