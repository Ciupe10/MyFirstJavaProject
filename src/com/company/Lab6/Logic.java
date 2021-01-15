package com.company.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {



    public boolean isValueInTheList (List<Integer> myList , int ceva) {
        for ( int i = 0 ; i < myList.size(); i++) {
            if (myList.get(i) == ceva ) {
                return true;
            }
        }
        return false;
    }


//   2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip lista de numere , si celalalt un numar (real sau intreg)
//    . Metoda sa adauge numarul primit ca si parametru la final de lista.

    public List<Integer> addNumberToList (List<Integer> myList,int number) {
        myList.add(number);
        return myList;
    }

//   1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printList(List<Integer> myList) {
        for (int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

//Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
// iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
// pornind de la numarul intreg primit ca si parametru.

    public void listFromNumber(List<Integer> mylist, int number ) {
        boolean found = false;

        for (int i = 0; i < mylist.size(); i++ ) {
            if (mylist.get(i) == number) {
                found = true;
            }
            if (found = true) {
                System.out.println(mylist.get(i));
            }
        }
    }


// 4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile
// din lista, dar invers(de la capat la inceput).

    public void printBackwards (List<Integer> aList) {
        System.out.println(aList);
        Collections.reverse(aList);
        System.out.println(aList);
    }

//  5.  Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
//  si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg
//  reprezinta pozitia la care sa fie pus acel String.

    public List<String> putAStringToAPosition (List<String> oneList , int position, String name) {
        oneList.add(position,name) ;
        return oneList;
    }

//    6.Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda
//    sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public  List<String> putAStringToFirstPosition (List<String> aList , String bam) {
        aList.add(1,bam);
        return aList;
    }


//  7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
//  si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void positionAndValue (List<String> aaList) {
        for (int i = 0 ; i < aaList.size(); i++) {
            String rezultat = "Pe pozitia " + i + " valoarea este " + aaList.get(i);
            System.out.println(rezultat);
        }
    }

//    8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int getMaxValue (List<Integer> aList) {
        int maximum = 0;
        for (int i = 0; i < aList.size();i++) {
            if (aList.get(i) > maximum ) {
                maximum = aList.get(i);
            }
        }

        return maximum;
    }

}
