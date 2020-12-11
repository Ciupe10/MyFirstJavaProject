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

        printMyName();

        float m = media(34, 45, 23, 3);
        System.out.println(m);

        System.out.println(java);
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

    static void printMyName() {
        System.out.println("Hello \nMihai");
    }

    static float media(float y, float t, float r, float e){
        return ((y*t*r)/e);
    }

    static String java = "   J    a   v     v  a\n   J   a a   v   v  a a  \n";
}



