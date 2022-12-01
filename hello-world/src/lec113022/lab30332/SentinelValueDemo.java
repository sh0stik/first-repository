package lec113022.lab30332;

import java.util.Scanner;

public class SentinelValueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int value = scanner.nextInt();
        int sum = 0;

        while (value != 0){
            sum += value;
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            value = scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
