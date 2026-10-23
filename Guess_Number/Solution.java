package Guess_Number;

public class Solution {

    private int pick = 6; // number to guess

    public int guess(int num) {
        if (num == pick)
            return 0;
        if (num > pick)
            return -1;
        return 1;
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.guessNumber(10));
    }
}