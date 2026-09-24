package power_Of_Four_342;

public class Solution {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfFour(16));
    }
}
