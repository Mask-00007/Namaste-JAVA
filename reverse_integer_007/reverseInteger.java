package reverse_integer_007;

public class reverseInteger {
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;

    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println("Output will be: " + reverse(x));
    }
}
