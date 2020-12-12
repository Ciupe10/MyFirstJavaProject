package com.company.lab2.AnimalRescue;

public class AnimalGame {
    public static void main(String[] args) {
        createAnimal();
    }

    static void createAnimal() {
        Animal cat = new Animal("Mitzi", 23, 7);
        Animal dog = new Animal();

        cat.describe();
        dog.describe();

        cat.setHappines(6);
        cat.describe();

        dog.setHappines(99);
        dog.describe();
    }
}
