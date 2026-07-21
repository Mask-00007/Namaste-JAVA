package basic_encapsulation;

public class student {
    // ATTRIBUTES
    public int id;
    public int age;
    public String name;
    public int nos;

    // DEFAULT CONSTRUCTOR => by default, it sets the value of attributes => Garbage
    public student() {
        System.out.println("Student default ctor called");
    }

    // PARAMETERISED CONSTRUCTOR
    public student(int id, int age, String name, int nos) {
        System.out.println("Student parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // COPY CONSTRUCTOR
    public student(student srcObj) { // srcObj -> A
        System.out.println("Student copy ctor called");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }

    // METHODS OR BEHAVIOURS
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }
}