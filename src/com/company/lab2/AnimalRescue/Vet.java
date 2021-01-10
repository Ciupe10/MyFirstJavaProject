package com.company.lab2.AnimalRescue;

public class Vet {

//    Atribute
    private String nameV;
    private String specializationV;

//        Constructor defaut
    public Vet(){};

//    Constructor custom
    public Vet( String nameVet, String specializationVet){

        this.nameV = nameVet;
        this.specializationV = specializationVet;

    }

    public String getNameV() {
        return nameV;
    }

    public void setNameV(String nameV) {
        this.nameV = nameV;
    }

    public String getSpecializationV() {
        return specializationV;
    }

    public void setSpecializationV(String specializationV) {
        this.specializationV = specializationV;
    }

    public void describe(){
        System.out.println("Vet names is: " + this.nameV + "-and his specialization is: " + this.specializationV );
    }


}
