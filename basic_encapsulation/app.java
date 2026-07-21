package basic_encapsulation;

public class app {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Using default ctor
        // student A = new student();
        // A.name = "Krish";
        // System.out.println(A.name);

        // A.bunk();

        // Using Parameterised ctor
        student A = new student(1, 12, "Rahul", 3);

        System.out.println(A.name);
        A.bunk();

        // Copy Constructor
        student B = new student(A);
        System.out.println(B.name);
        B.sleep();
    }
}
