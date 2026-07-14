package Inheritance;

public class Main {
    public static void main(String[] args) {
        car c = new car("BMW", "M1", 4, 5, "Manual");
        c.startEngine();
        c.startAc();
        c.stopEngine();

        motorcycle M = new motorcycle("BMW", "450GS", 2, "Upright", "USD");
        M.startEngine();
        M.wheelie();
        M.stopEngine();
    }
}
