package lab120122;

import java.util.Arrays;

public class ResizedArray {
    public static void main(String[] args) {
        ResizedArray resizedArray = new ResizedArray();
        int [] array = new int[] {1,2,3,4,5,6};
        System.out.println("Original array: " + Arrays.toString(array));

        array = resizedArray.increaseArraySize(array, 6);
        System.out.println("Resized array: " + Arrays.toString(array));
    }

    private int[] increaseArraySize(int[] array, int delta){

        return Arrays.copyOf(array, array.length + delta);
    }
}
