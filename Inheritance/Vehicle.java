package Inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    // DEFAULT CONSTRUCTOR
    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    // PARAMETERISED CONSTRUCTOR
    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        // System.out.printf("Engine is starting of %s : %s\n", name, model);
        System.out.println("Engine is starting of " + name + " : " + model);
    }

    void stopEngine() {
        System.out.println("Engine is stoping of " + name + " : " + model);
    }

}
