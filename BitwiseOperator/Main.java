package BitwiseOperator;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // AND operator
        System.out.println(a & b);

        // OR operator
        System.out.println(a | b);

        // XOR operator
        System.out.println(a ^ b);

        // BITWISE LEFT SHIFT (<<) :- Jitne position se left shift krnege, utni baar wo
        // 2 se multiply ho jayega..
        // agar kisi number ko ek baaar left shift krenge to 2 se multiply hoga; agr 2
        // baar left shift krenge to 2*2 time multiply hoga.......
        // num << i -> num*2^i;

        int n = 1;
        for (int i = 1; i <= 32; i++) {
            n = n << 1;
            System.out.println(n);
            System.out.println();
        }

        // BITWISE RIGHT SHIFT (>>) :- same rule bas 2 se divide krnge
        int m = 100;
        for (int i = 1; i <= 10; i++) {
            m = m >> 1;
            System.out.println(m);
            System.out.println();
        }

        // EVEN OR ODD
        int z = 11;
        if ((z & 1) == 0) {
            System.out.println(z + "is even");
        } else {
            System.out.println(z + " is odd");
        }

        // Power of 2 logic -> which contains single set bit (1)

        int x = 5;
        int count = 0;
        while (x != 0) {
            if ((x & 1) != 0) {
                count++;
            }
            // right shift to remove this bit
            x = x >> 1;
        }
        System.out.println("Set bit count: " + count);

        // More optimized method
        if ((x & (x - 1)) == 0) { // To remove last set bit
            System.out.println("Power of 2 hai");
        } else {
            System.out.println("Power of 2 nahi hai");
        }

        // Swapping of numbers using XOR
        int c = 5;
        int d = 6;

        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println("After swapping c: " + c);
        System.out.println("After swapping d: " + d);

        // Find unique elements(all others appear twice) :- Do the XOR operation on all
        // the given numbers

        // TO FIND LAST SET BIT
        int y = 10;
        System.out.println((y & (y - 1)));
        System.out.println((y & -(y))); // Last set bit

    }

}
