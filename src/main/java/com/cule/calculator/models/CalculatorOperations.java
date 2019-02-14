package com.cule.calculator.models;

public class CalculatorOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int sqare2(int a) {
        return a * a;
    }

    public int square3(int a) {
        return a * a * a;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public int factorial(int a) {
        int result = 1;
        for (int i = 2; i <= a ; i++) {
            result *= i;
        }
        return result;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}
