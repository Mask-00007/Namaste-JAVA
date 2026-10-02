package first_occurence;

public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // Example runner
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.strStr("sadbutsad", "sad"));
    }
}
