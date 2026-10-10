package count_Valid_Prefixes;

public class Solution {
    public int countValidPrefixes(String s) {
        int ans = 0;
        int balance = 0; // difference between count of '1' and '0'

        for (char c : s.toCharArray()) {
            balance += (c == '1') ? 1 : -1;
            if (Math.abs(balance) <= 1) {
                ans++;
            }
        }
        return ans;
    }
}
