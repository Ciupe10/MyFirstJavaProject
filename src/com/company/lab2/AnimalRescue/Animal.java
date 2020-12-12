package com.company.lab2.AnimalRescue;

public class Animal {

    //animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10), nivelul senzației de foame (de la 1 la 10),
    // nivelul stării de spirit (de la 1 la 10), numele mâncării preferate, numele activității de recreere preferate
// Atribute
    //private: vizibile in clasa
    //protected: vizibile in pachet
    //public: vizibile global
    public String name;
    protected double age;
    private int healthy = 10;
    private int happines;

    //Constructor default
    public Animal(){};
// constructor custom
    public Animal(String name1, double age1, int healthy1){
        this.name = name1;
        this.age = age1;
        this.healthy = healthy1;
    }

    //Metodele
    public void describe(){
        System.out.println(this.name + " - " + this.age + " - " + this.healthy + " happiness: " + this.happines);
    }

    public void setHappines(int happiness1){
        this.happines = happiness1;
    }

    public int getHappines() {
        return this.happines;
    }
}
