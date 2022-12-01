package lab120122;

public class MethodsExample {

    // create a method that adds 2 parameters and returns their sum
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        // create an object of type MethodsExample
        MethodsExample obj = new MethodsExample();
        // call your  method
        int sum = obj.sumCalculation(num1, num2);
//        System.out.println("Sum is: " + sum);



        int inputValue=10;
        // call the method
        // store returned value to result
        int square = obj.squareCalculation(inputValue);

        System.out.println("Squared value  is: " + square);
    }

    private int sumCalculation(int first, int second){
        return first + second;
    }

    private int squareCalculation(int num){
        return num * num;
    }
}
