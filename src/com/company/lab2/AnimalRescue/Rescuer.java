package com.company.lab2.AnimalRescue;

public class Rescuer {

    private String name;
    private double amountOfMoney;

    //Constructor default
    public Rescuer(){};

    //Constructor custom
    public Rescuer( String nameRe, double amountofmoneyR){
        this.name = nameRe;
        this.amountOfMoney = amountofmoneyR;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void describe(){
        System.out.println("Rescuer name is: " + this.name + "and he has this amount of money" + this.amountOfMoney);
    }
}
