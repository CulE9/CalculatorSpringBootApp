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

    public String division(int a, int b) {
        if (b == 0) {
            System.out.println("DEVIDE BY ZERO!");
            return "DEVIDE BY ZERO!";
        }
        return "" + a / (double) b;
    }

    public int square(int a) {
        return a * a;
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public double cubeRoot(int a) {
        return Math.sqrt(Math.sqrt(a));
    }

    public int factorial(int a) {
//        // single line to find factorial
//        return (a == 1 || a == 0) ? 1 : a * factorial(a - 1);
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}
