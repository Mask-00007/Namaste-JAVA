package Inheritance;

public class motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    motorcycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType) {
        // Intializing through the constructor of car, corresponding to Vehcile using
        // Super keyword
        super(name, model, noOfTyres); // Base class attributes calling
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;

        // super.startEngine(); // Base class method/function calling
    }

    void wheelie() {
        System.out.println("Motorcycle is doing wheelie " + name);
    }
}
