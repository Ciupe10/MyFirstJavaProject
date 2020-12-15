package com.company.Lab3;

public class Lab3 {

    public static void main(String[] args) {



        Math sumOperator = new Math();
        int a = 7;
        int b = 8;
        int resSum = sumOperator.sum(a,b);
//        System.out.println(resSum);

        Math divideOperator = new Math();
        double d = 4;
        double f = 2;
        double resDivide = divideOperator.divide(d,f);
//        System.out.println(resDivide);

        Math multiplicationOperator = new Math();
        int resMulti = multiplicationOperator.multiplication(a,b);
//        System.out.println(resMulti);

        Math minusOperator = new Math();
        int resMinus = divideOperator.minus(a,b);
//        System.out.println(resMinus);





        Logic logic = new Logic();
        int x = 2;
        int y = -2;
        int result = logic.coompareNumbers(x,y);
//        System.out.println(result);
//        System.out.println(logic.coompareNumbers(x,y));


//        Given a text input, if it is “FastTrack”, then
//        print “Learning text comparison”. If not,
//        print “Got to try some more”

        String text = "FastTrack";

//        System.out.println(logic.compareStrings(text));
//        System.out.println(logic.compareStrings("asd"));

// Given a number, if it’s equal to or higher than 2
// and equal to or lower than 8, print the number

        int aNumber = 9;

//        System.out.println(logic.verifyInInterval(aNumber));

//        Given a text input and a number input,
//        if the text is equal to “FastTrack”
//        AND the number is equal to or
//        lower than 3, print the text and
//        the number. If the text is not
//        “FastTrack” AND the number is equal
//        to or higher than 4, print the number
//        and the text, in this order


//        System.out.println(logic.verifyTextAndNumberInterval(3, "FastTrack"));
//        System.out.println(logic.verifyTextAndNumberInterval(2, "FastTrack"));
//        System.out.println(logic.verifyTextAndNumberInterval(4, "FastTrack"));
//        System.out.println(logic.verifyTextAndNumberInterval(4, "NotFast"));


//        6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
//        Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
//        “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):”
//        si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

//        System.out.println(logic.verifySnow(810));

//
//        7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
//    Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
//    Daca numarul este egal cu 4, returnati “The number is equal to 4”,
//    iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

//        System.out.println(logic.verifyNumber(3.2));


//     8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//     Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !
//     " unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
//     "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din
//     Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.

//       logic.eightCase(2);


//    9. Creati o metoda care sa se numeasca isNumberEven.
//    Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
//    Daca numarul e par sa returneze true iar daca e impar sa returnese false.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

//        System.out.println(logic.isNumberEven(100));


//     10. Creati o metoda care sa se numeasca isEligibleToVote.
//     Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
//     iar metoda sa iti zica daca daca persoana are drept de vot.
//     Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
//     Apelati metoda in main() pentru a verifica daca functioneaza.

//        System.out.println(logic.isEligibleToVote(18.1));

//   11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
//   Apelati metoda in main() pentru a verifica daca functioneaza.





    }
}
