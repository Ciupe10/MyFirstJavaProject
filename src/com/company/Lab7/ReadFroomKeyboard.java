package com.company.Lab7;

import java.util.*;

public class ReadFroomKeyboard {

    public int readInt() {
        int x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare: ");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public double readDouble() {
        double x = 0.3;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare: ");
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public String readString() {
        String x = "asdasdas";
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare: ");
            try {
                x = scanner.next();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }


    public float readFloat() {
        float x = 0f;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare: ");
            try {
                x = scanner.nextFloat();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

//    3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
//    Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] arrayFromKeyboard(int positions) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[positions];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter int for array[" + i + "]: ");
            arr[i] = kb.nextInt();
        }

        return arr;
    }

// 4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public List<Integer> getNumbersFromKeyboard() {
        Scanner nr = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Introduceti un numar:");
                myList.add(nr.nextInt());
            } catch (InputMismatchException x) {
                System.out.println("Valoarea introdusa nu corespunde.");
                flag = false;
            }

        }
        return myList;
    }

}



