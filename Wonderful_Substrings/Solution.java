package Wonderful_Substrings;

public class Solution {

    public long wonderfulSubstrings(String word) {
        long[] freq = new long[1024]; // 2^10 masks
        freq[0] = 1;

        int mask = 0;
        long ans = 0;

        for (char ch : word.toCharArray()) {
            mask ^= (1 << (ch - 'a'));

            // All characters have even counts
            ans += freq[mask];

            // Exactly one character has odd count
            for (int i = 0; i < 10; i++) {
                ans += freq[mask ^ (1 << i)];
            }

            freq[mask]++;
        }

        return ans;
    }
}