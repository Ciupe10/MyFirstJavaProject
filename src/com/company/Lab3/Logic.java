package com.company.Lab3;

import java.util.Collections;

public class Logic {


    public int coompareNumbers(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public String compareStrings(String value) {

        if (value.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return "Got to try some more";
        }
    }

    public int verifyInInterval(int aNumber) {
        if (aNumber >= 2 && aNumber <= 8) {
            return aNumber;
        } else {
            return -1;
        }

    }

    public String verifyTextAndNumberInterval(int number, String text) {
        if (text.equals("FastTrack") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrack") && number >= 4) {
            return (number + text);
        } else {
            return "";
        }
    }


    public String verifySnow(int number1) {
        if (number1 > 8 || number1 == 6) {
            return ("The amount of snow this winter was(cm):" + number1);
        } else {
            return ("The forecast snow is(cm):" + number1);
        }

    }


//    7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
//    Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
//    Daca numarul este egal cu 4, returnati “The number is equal to 4”,
//    iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

    public String verifyNumber(double w) {
        if ((w > 3) && (w != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (w == 4) {
            return "The number is equal to 4";
        } else if (w < 3) {
            return "The number is lower than 3";
        } else {
            return " ";
        }
    }


//    8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//    Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
//    unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
//    "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

    public void eightCase(int number) {


        switch (number) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
            default:
                System.out.println("Not a valid number");
        }
    }

//    9. Creati o metoda care sa se numeasca isNumberEven.
//    Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
//    Daca numarul e par sa returneze true iar daca e impar sa returnese false.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isNumberEven(int number2) {


        if ((number2 % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }


//     10. Creati o metoda care sa se numeasca isEligibleToVote.
//     Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
//     iar metoda sa iti zica daca daca persoana are drept de vot.
//     Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
//     Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isEligibleToVote(double k) {
        if (k > 18) {
            return true;
        } else {
            return false;
        }
    }


//11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public int biggestNumber(int j, int h, int g) {
        if (j > h && j > g) {
            return j;
        } else if (h > j && h > g) {
            return h;
        } else {
            return g;
        }

    }



    public String ascendingOrder (double m, double n) {
        if (m < n) {
            return "Ordinea numerelor este:" + m + ", " + n;
        } else if (n < m ) {
            return "Ordinea numerelor este:" + n + "," + m;
        }else {
            return " ";
        }
    }


    public double min (double r,double t, double y) {
        if (r < t && r < y) {
            return r;
        }else if ( t < r && t < y ) {
            return t ;
        }else if ( y < r && y < t ); {
        } return y;
    }

//    public String maxAndMin ( int z,int x, int c){
//
//        return  Collections. max(maxAndMin(75,45,22))  ;
//
//    }

}



