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
    private int hungrylevel;
    private String favoritefood;
    private String favoriterecreationalactivity;


    //Constructor default
    public Animal(){};
    // constructor custom
    public Animal(String name1, double age1, int healthy1,int happiness1, int hungry1, String favoritfood1,String favoriterecreationalactivity1){
        this.name = name1;
        this.age = age1;
        this.healthy = between1to10(healthy1);
        this.hungrylevel = between1to10(hungry1);
        this.favoritefood = favoritfood1;
        this.favoriterecreationalactivity =favoriterecreationalactivity1;

    }

    //Metodele
    public void describe(){
        System.out.println(this.name + " -Age: " + this.age + " -Healthy level: " + this.healthy + " -Happiness: " + this.happines + "-Hungry level: " +  this.hungrylevel + "-Favorite food: " + this.favoritefood  + "-Favorite recreational activity: " + this.favoriterecreationalactivity) ;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        if (healthy>10) {
            this.healthy = 10;
        }else if ( 0>healthy ){
            this.healthy = 1;
        } else {
            this.healthy = healthy;
        }
    }

    public int getHungrylevel() {
        return hungrylevel;
    }

    public void setHungrylevel(int hungrylevel) {
    //      && - and
    //      || - or
    //      == - comparatie
    //      != - diferit
    //      < > <= >= - comparatori

        if (11>hungrylevel && hungrylevel>0) {
            this.hungrylevel = hungrylevel;
        }else if (0>hungrylevel){
            this.hungrylevel = 1;
        }else {
            this.hungrylevel=10;
        }

//        Structura de baza if!!!
//        if (1 == 1){
//            System.out.println("1=1");
//        }else {
//            System.out.println("1 != 1");
//        }
//
    }


    public String getFavoritefood() {
        return favoritefood;
    }

    public void setFavoritefood(String favoritefood) {
        this.favoritefood = favoritefood;
    }

    public String getFavoriterecreationalactivity() {
        return favoriterecreationalactivity;
    }

    public void setFavoriterecreationalactivity(String favoriterecreationalactivity) {
        this.favoriterecreationalactivity = favoriterecreationalactivity;

    }

    public void setHappines(int happiness1){

//        if (11>happiness1 && happiness1>0) {
//            this.happines = happiness1;
//        }else {
////            -5,7 (nu), 14,10
//            this.happines = (1 > happiness1) ? 1 : 10;
//        }
        this.happines = between1to10(happiness1);
    }

    public int getHappines() {
        return this.happines;
    }

    public void setName(String name){
        this.name = name;
    }

    private int between1to10(int value) {
        if (11>value && value>0) {
            return value;
        }else if (0>value){
            return 1;
        }else {
            return 10;
        }
    }

    public void eat() {
        System.out.println("eating");
    }

    public void speaking(){
        System.out.println("Ahhh");
    }
}
