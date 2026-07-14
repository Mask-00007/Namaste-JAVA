package Encapsulation;
public class testEncapsulation {
    public static void main(String[] args) {
        encapsulation A = new encapsulation(1, 12, "Rahul", 8, "Tina");

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.getGfName());
         A.setGf("Soni");
        System.out.println(A.getGfName());

        A.bunk();
        A.sleep();
        A.startChatting();
    }
}
