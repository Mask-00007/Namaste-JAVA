package Polymorphism;

public class Main {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(1, 5, 7));

        circle x = new circle();
        // x.draw();
        doDrawing(x);

    }

    // Upcasting Method -> One of the best method ever
    public static void doDrawing(shape s) {
        s.draw();
    }

}
