package subsequence;

public class Solution {

    // Recursive function to print all subsequences
    public static void printSubsequences(String s, int index, String current) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        // Choice 1: include current character
        printSubsequences(s, index + 1, current + s.charAt(index));

        // Choice 2: exclude current character
        printSubsequences(s, index + 1, current);
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubsequences(s, 0, "");
    }
}
