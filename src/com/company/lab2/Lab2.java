package com.company.lab2;

public class Lab2 {

    public static void main(String[] args) {
        int result = sum(32, 56);
        System.out.println(result);

        double res = divide(345, 123);
        System.out.println(res);

        int re = multiplication(234, 234);
        System.out.println(re);

        int r = minus(456, 234);
        System.out.println(r);
    }

    static int sum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    static double divide(double number4, double number5) {
        return (number4 / number5);
    }

    static int multiplication(int a, int b) {
        return (a * b);
    }

    static int minus(int z, int x) {
        return (z - x);
    }
}



