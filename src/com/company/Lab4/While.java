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




}

