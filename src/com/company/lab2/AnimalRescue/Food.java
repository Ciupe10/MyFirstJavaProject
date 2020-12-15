package com.company.lab2.AnimalRescue;

public class Food {

    //  Atribute
    private String nameF;
    private double priceF;
    private double amount;
    private boolean availability;
    private int stock = 178;

    //    Constructor default
    public Food() {
    }

    ;

    //    Constructor custom
    public Food(String nameFoo, double priceFoo, double amountF, boolean availabilityF) {
        this.nameF = nameFoo;
        this.priceF = priceFoo;
        this.amount = amountF;
        this.availability = availabilityF;
    }

    //    Metode
    public void describe() {
        System.out.println("Food- " + this.nameF + "-Price:" + this.priceF + "-Amount:" + this.amount + "-Availability: " + this.availability);
    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public double getPriceF() {
        return priceF;
    }

    public void setPriceF(double priceF) {
        this.priceF = priceF;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean availability(boolean availability) {
        if (stock > amount)
        {
            return true; // return success
        } else {
            return false; // return failure
        }
    }
}
