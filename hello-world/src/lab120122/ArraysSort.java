package lab120122;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] integers = {30, 57, 88, 12, 34, 54, 90, 62, 82, 10};
        System.out.println("Before sort: " + Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println("After sort: " + Arrays.toString(integers));
    }
}
