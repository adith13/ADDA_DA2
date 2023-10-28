package com.adith.teamProjectOne;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 10;
        int b = 5;

        int additionResult = add(a, b);
        int subtractionResult = subtract(a, b);
        int multiplicationResult = multiply(a, b);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
    }

    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to subtract one integer from another
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }
}
