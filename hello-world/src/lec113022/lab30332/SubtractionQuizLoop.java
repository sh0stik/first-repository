package lec113022.lab30332;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder();
        String oneMoreTime = "Yes";
        Scanner scan = new Scanner(System.in);

        while (oneMoreTime.equals("Yes")) {
            while (count < NUMBER_OF_QUESTIONS) {
                int numOne = (int) (Math.random() * 10);
                int numTwo = (int) (Math.random() * 10);
                if (numOne < numTwo) {
                    int temp = numOne;
                    numOne = numTwo;
                    numTwo = temp;
                }
                System.out.print(
                        "What is " + numOne + " - " + numTwo + "? ");
                int answer = scan.nextInt();
                if (numOne - numTwo == answer) {
                    System.out.println("You are correct!");
                    correctCount++;
                } else
                    System.out.println("Your answer is wrong.\n" + numOne
                            + " - " + numTwo + " should be " + (numOne - numTwo));

                count++;
                output.append("\n").append(numOne).append("-").append(numTwo).append("=").append(answer).append((numOne - numTwo == answer) ? " correct" : " wrong");
            }
            System.out.println("Your score is " + correctCount + " out of " + count);
            System.out.println("One more time? Yes / No");
            oneMoreTime = scan.next();
            if (oneMoreTime.equals("Yes")) {
                count = 0;
                correctCount = 0;
            }
        }
        System.out.println("See you!");
        scan.close();
    }
}
