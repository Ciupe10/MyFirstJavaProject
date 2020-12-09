package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1. Hello");
        System.out.println("Mihai");

    // Sum of two numbers
       int num1 = 456;
       int num2 = 4356;
       int sum = num1+num2;
        System.out.println("2. Suma numerelor 456 si 4356 este " + sum);

    // Dividing two numbers
        double num3 = 615;
        double num4 = 123;
        System.out.println("3. Rezultatul impartirii este " + num3/num4);

        int num5 = 5;
        double num6 = 3;
        System.out.println("Rezultatul impartirii este " + num5/num6);

    // The result of following operations
    //a.
        int num7 = -5;
        int num8 = 8;
        int num9 = 6;
        int res = num7+num8*num9;
        System.out.println("4. Rezultatele sunt: ");
        System.out.println("a." + res);

    //b.
        int num10 = 55;
        int num11 = 9;
        int res1 = (num10 + num11) % num11;
        System.out.println("b." + res1);

    //c.
        double num12 = 20;
        double num13 = -3;
        double num14 = 5;
        double num15 = 8;
        double res2= num12+num13*num14/num15;
        System.out.println("c." + res2);

    //d.
        double num16 = 5;
        double num17 = 15;
        double num18 = 3;
        double num19 = 2;
        double num20 = 8;
        double res3 = num16+num17/num18*num19-num20%num18;
        System.out.println("d." + res3);
    }
}
