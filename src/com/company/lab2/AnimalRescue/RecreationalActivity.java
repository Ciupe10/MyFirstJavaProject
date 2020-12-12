package com.company.lab2.AnimalRescue;

public class RecreationalActivity {
    //activitate de recreere: nume

    private String name;

    //constructor defaul
    public RecreationalActivity(){};
    //constructor custom
    public RecreationalActivity(String nameR){
        this.name = nameR;

    }
// se practica sa ai Atributele pe private si se dau 2 metode:Get(primesti inapoi) si Set(setezi o valoarea)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setName(String nameR) {
//        this.name = nameR;
//    }

//    public String getName(){
//        return this.name;
//   }

    public void describe(){
        System.out.println("This recreationalactivity name is: " + this.name);
    }
}
