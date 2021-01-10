package com.company.Lab5;

import java.util.Arrays;

public class Logic {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void populateArrayWithValues(int[] array, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
        }
    }

    public int[] setConsecutiveValuesToArray(int minim, int maxValue) {
        int[] array = new int[maxValue];
        for (int i = minim - 1; i < maxValue; i++) {
            array[i] = i + 1;
        }
        return array;
    }


    public float checkSum(float one, float two) {
        return one + two;
    }

    public float checkSum(float first, float second, float third) {
        return first + second + third;
    }

    public int checkSum(int one, int two, int third, int four) {
        return one + two + third + four;
    }


// 3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il
// returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica
// daca functioneaza. Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] valoriPare(int[] array) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                array[i / 2 - 1] = i;

            }
        }
        return array;
    }


//4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
// Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.

    public float media(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println(sum);
        System.out.println(array.length);
        return sum / array.length;

    }

//7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
//
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -


    public String[] setArrayMinus(int max) {
        String[] myArray = new String[max];
        for (int i = 0; i < max; i++) {
            myArray[i] = "-";
        }
        return myArray;
    }

    public void printMinus(String[] myArray) {
        for (int i = 0; i <= 7; i++) {
            System.out.print("-");
        }
    }

    public void printMinus2(String[] myArray, int number) {
        for (int i = 0; i <= 7; i++) {
            printMinus(myArray);
            System.out.println();
        }
    }


// 5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru
// de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da
// sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean checkString(String[] clasa, String nume) {
        for (int i = 0; i < clasa.length; i++) {
            if (nume.contains(clasa[i])) {
                return true;
            }
        }
        return false;
    }

//    6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
//    si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
//    si daca da, atunci sa returneze pozitia pe care se afla numarul.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

    public void checkNumber (int[] numere, int numar){
      for (int i = 0; i < numere.length; i++) {
          if (numere[i] == numar) {
              System.out.println(i);
          }
      }
    }


// 10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori,
// si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l,
// in cel de-al doilea. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void copyArray(int[] array1, int[] array2){
        for(int i=0; i<array1.length;i++){
            array2[i]=array1[i];
        }
        for (int i=0; i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }

//8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
// si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
// sa returneze array-ul primit, fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void arrayWithoutValue(int[] array, int doi) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != doi) {
                System.out.println(array[i]);
            }

        }
    }

// 9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel
// mai mic numar din array. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void secondminArray(int[] array){
        int min=10000000;
        int min2=10000000;
        for(int i=1;i<array.length; i++){
            if(array[i]<min){
                min2=min;
                min=array[i];
            }else if(array[i]<min2){
                min2=array[i];
            }
        }
        System.out.println(min2);
    }


}
