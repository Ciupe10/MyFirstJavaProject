package com.company.Lab4;

public class While {

// Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printToOneHundred(int start) {
        while (start <= 100) {
            System.out.println(start);
            start++;
        }
    }

//Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countToMinus(int first) {
        if (first <= -100) {
            while (first <= -100) {
                System.out.println(first);
                first++;
            }
        } else {
            while (first >= -100) {
                System.out.println(first);
                first--;
            }

        }
    }

//3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void countXToY(int x, int y) {
        if (x <= y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else {
            while (x >= y) {
                System.out.println(x);
                x--;
            }
        }
    }


//  4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
//  Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic
//  la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
//  atunci numaratoarea sa fie de la y la x).

    public void countAscending(int x, int y) {
        if (x <= y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        }

    }

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void evenNumber() {
        int number = 1;
        while (number <= 100) {
            if ((number % 2) == 0) {
                System.out.println(number);
            }
            number++;
        }

    }

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.


    public void oddNumber() {
        int numbers = 1;
        while (numbers <= 100) {
            if ((numbers % 2) != 0) {
                System.out.println(numbers);
            }
            numbers++;
        }

    }

//9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibonacci() {

        int i = 1, n = 20, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n) {
            System.out.print(t1 + " - ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }

// Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
// iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
// Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.





    public void getSum () {
        int j = 111; double sum = 0; int count = 0;

        while (j >= 111 && j <= 8899 ) {
            sum += j;
            j++;
            count++;
        }
        System.out.println(count);


        double media = sum/count;
        System.out.println(media);
    }


//8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7,
// din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public double between ( int f, int g ) {
         int j = f; double sum = 0; int i = 0;
        while ( j >= f && j<= g ) {
            if ( j % 7 == 0 ) {
                sum += j;
                i++;

            } j++;
        }double d = sum/i;
        return d;
    }


//10. Creati o metoda numita CozaLozaWoza.
//
//Metoda va afisa:
//
//- numerele de la 1 la 110
//
//- 11 numere pe linie
//
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//
//Ar trebui sa arate similar:
//
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
//
//
//......

    public void coza () {
        int number = 1;
        while (number <= 110) {

//      number % 3 == 0 => Coza
//      number % 5 == 0 => Loza
//      number % 7 == 0 => Woza
//      number % 3==0 && number % 5 == 0 => CozaLoza
//      number % 3 == 0 && number % 7 == 0 => CozaWoza
//      numer % 5 == 0 && number % 7 == 0 => WozaLoza
//      number % 3 == 0 && number % 7 == 0 && number % 5 == 0 => CozaLozaWoza

            if (number % 3 == 0 && number % 7 == 0 && number % 5 == 0){
                System.out.print("CozaLozaWoza"+ " ");
            } else if ( number % 5 == 0 && number % 7 == 0){
                System.out.print("WozaLoza" + " ");
            } else if ( number % 3 == 0 && number % 7 == 0) {
                System.out.print("CozaWoza" + " ");
            }else if ( number % 3 == 0 && number % 5 == 0){
                System.out.print("CozaLoza" + " ");
            }else if ( number % 7 == 0) {
                System.out.print("Woza" + " ");
            }else if ( number % 5 == 0 ) {
                System.out.print("Loza" + " ");
            } else if ( number % 3 == 0) {
                System.out.print("Coza" + " ");
            }else {
                System.out.print(number + " ");
            }

            if (number % 11 == 0){
                System.out.println();
            }

            number++;
        }
    }


}

