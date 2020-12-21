package com.company.lab2.AnimalRescue;

public class AnimalGame {
    public static void main(String[] args) {
        createAnimal();
        createRecreationalactivity();
        createRescuer();
        createVet();
        createFood();

    }

    static void createAnimal() {
//        Animal cat = new Animal("Mitzi", 23, 7, 4,8,"Whiskas", "running");
//        Animal dog = new Animal();
//        Animal monkey = new Animal("mimi", 12,8,7,8,"bananas","running");
//
//        cat.setHealthy(43);
//        cat.describe();
//        dog.describe();
//
//        cat.setHungrylevel(13);
//        cat.setHealthy(7);
//        cat.setHappines(16);
//        cat.describe();
//
//        dog.setHappines(99);
//        dog.describe();
//
//        monkey.describe();
//        monkey.setName("Kiti");
//        monkey.describe();
//        monkey.getHappines();

        Cat Mikey = new Cat();
        Mikey.setAge(9);
        Mikey.setFavoritefood("Whiskas");
        Mikey.setName("Mikey");
        Mikey.eat();
        Mikey.setHappines(7);
        Mikey.setHungrylevel(6);
        Mikey.setFavoriterecreationalactivity("Running");
        Mikey.describe();

        Horse ducky = new Horse();
        ducky.setName("Ducky");
        ducky.describe();

        PetVet Jon = new PetVet();
        Jon.setNameV("Jon");
        Jon.setSpecializationV("Dog specialization");
        Jon.describe();







    }
    static void createRecreationalactivity(){
        RecreationalActivity running = new RecreationalActivity("Run");
        RecreationalActivity toys = new RecreationalActivity("toy");

        running.describe();
        toys.describe();

        System.out.println("This recreational activity name is: " + running.getName());
    }

    static void createRescuer(){
        String Jon = "Jon";
        Rescuer John = new Rescuer(Jon, 23.0);

        John.describe();

    }

    static void createVet(){
        Vet Bob = new Vet("Bob","Dogs" );

        Bob.describe();
    }

    static void createFood(){
        Food Cat = new Food("Whyskas",23.4,134,true);

        Cat.describe();
    }

}
