package longest_palindrome_409;

public class Solution {
    public static int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII range
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int freq : count) {
            length += (freq / 2) * 2; // add even part
            if (freq % 2 == 1)
                oddFound = true;
        }

        return oddFound ? length + 1 : length;
    }

    public static void main(String[] args) {
        String s1 = "abccccdd";
        System.out.println(longestPalindrome(s1));
    }
}
