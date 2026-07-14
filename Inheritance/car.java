package Inheritance;

public class car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        // Intializing through the constructor of car, corresponding to Vehcile using
        // Super keyword
        super(name, model, noOfTyres); // Base class attributes calling
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        // super.startEngine(); // Base class method/function calling
    }

    void startAc() {
        System.out.println("AC has been started of " + name);
    }
}
