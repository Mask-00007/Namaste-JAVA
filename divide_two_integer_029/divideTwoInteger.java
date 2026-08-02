package divide_two_integer_029;

public class divideTwoInteger {

    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        int result = 0;

        while (lDividend >= lDivisor) {
            long temp = lDivisor, multiple = 1;
            while (lDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            lDividend -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        divideTwoInteger obj = new divideTwoInteger();
        System.out.println(obj.divide(10, 3));
        System.out.println(obj.divide(7, -3));
        System.out.println(obj.divide(-2147483648, -1));
    }

}
