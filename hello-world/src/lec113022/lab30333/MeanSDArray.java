package lec113022.lab30333;

public class MeanSDArray {
    public static void main(String[] args) {
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        for (int mark : marks) {
            sum += mark;
            sumSq += mark * mark;
        }
        mean = (double) sum / marks.length;
        stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }
}
