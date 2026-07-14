

public class encapsulation {
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    public String getGfName() {
        return this.gf;
    }

    public void startChatting() {
        gfChatting();
    }

    // SETTER METHOD
    public void setGf(String gf) {
        this.gf = gf;
    }

    public encapsulation(int id, int age, String name, int nos, String gf) {
       System.out.println("Student parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    private void gfChatting() {
        System.out.println(name + " Chatting");
    }

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






