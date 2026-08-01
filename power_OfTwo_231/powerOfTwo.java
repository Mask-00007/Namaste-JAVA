package power_OfTwo_231;

public class powerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        powerOfTwo p = new powerOfTwo();
        System.out.println(p.isPowerOfTwo(16));
        System.out.println(p.isPowerOfTwo(18));
    }

}
