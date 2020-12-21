package com.company.Lab4;

public class Logic {

    public void printBackwards(int startValue) {
        for (int i = startValue; i >= 100; i--) {
            System.out.println(i);
        }
    }

    //Sum the numbers from 1 to 100
    public int getSum(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = i + sum;
        }
        return sum;
    }


// count to -100

    public void countToMinus(double q) {
        if (q <= -100) {
            for (double i = q; i <= -100; i++) {
                System.out.println(i);
            }
        } else {
            for (double i = q; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }

//    count to 100

    public void coutToOneHundred(int startValue) {
        if (startValue <= 100) {
            for (int i = startValue; i <= 100; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = startValue; i >= 100; i--) {
                System.out.println(i);
            }
        }

    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void countBetween(int x, int y) {
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= y; i--) {
                System.out.println(i);

            }
        }
    }


//    4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
//    Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
//    si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
//    (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void ascendingCount (int a,int b){
        if ( a <= b ) {
            for ( int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }else {
            for ( int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void evenNumbers () {
        int number = 100;
        for ( int i = 1; i <= number; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

// 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void oddNumbers () {
        int numbers = 100;
        for ( int i = 1; i <= numbers; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


//7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100,
// pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main()
// pentru a verifica daca functioneaza.

    public int getSum(int first ) {
        int sum = 0;
        for (int i = first; i <= 100; i++) {
            sum = i + sum;
        }
        return sum;
    }

//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100,
// pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int getMedia(int first ) {
        int media = 0;
        for (int i = first; i <= 100; i++) {
            media = (i + media) / 2;
        }
        return media;
    }


}
