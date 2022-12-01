package lec113022.lab30332;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomInt = (int) (Math.random() * 101);
        int number = -1;
        while (number != randomInt){
            System.out.println("Enter a number from 0 to 100");
            number = scan.nextInt();
            if(number < randomInt){
                System.out.println("Your number is too low");
            }else if(number > randomInt){
                System.out.println("Your number is too high");
            }else System.out.println("Yes, the number is " + number);
        }
        scan.close();
    }
}
