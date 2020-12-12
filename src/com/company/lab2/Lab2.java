package com.company.lab2;


import java.text.DecimalFormat;

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

        System.out.println(robot);

        double rest = rst(10, 8);
        System.out.println(rest);

        System.out.println("Farenheit to Celsius:" + fToC (45 ));

        System.out.println("Inch to meter:" + iToM(3));

       speed(90.0,0,1,30);


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

    static String java = "   J    a   v     v  a\n   J   a a   v   v  a a  \nJ  J  aaaaa   V V  aaaaa \n JJ  a     a   V  a     a";

    static String robot = "  +\"\"\"\"\"+ \n [| o o |] \n  |  ^  |\n  | '-' | \n  +-----+ ";

    static double rst(double p, double o){
        return p%o;
    }

//    C = 5/9 * (F -32)
    static double fToC (double farenheit){
        double celsius = 5/9.0 * (farenheit-32);
        return celsius;
    }

    static double iToM(double inch){
        double meter = inch/39.37;
        DecimalFormat df = new DecimalFormat("#.####");
        String meterString = df.format(meter);
        System.out.println(meterString);
        System.out.println(meter);
        double result = Double.valueOf(meterString);
        return result;
    }

    static void speed(double distance,int hour, int minutes, int seconds){
        double mps = distance/((hour*3600)+(minutes*60)+seconds);
        System.out.println("Meter per second:" + mps);
        double kph = mps * 3.6;
        System.out.println("Km per Hour: " + kph);
        double milesph = kph / 1.609;
        System.out.println("Miles per hour:" + milesph);

    }


}




