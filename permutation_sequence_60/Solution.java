package permutation_sequence_60;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {

        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        List<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            digits.add(i);
        }

        StringBuilder sb = new StringBuilder();
        k--;
        for (int i = n; i >= 1; i--) {
            int idx = k / fact[i - 1];
            sb.append(digits.get(idx));
            digits.remove(idx);
            k %= fact[i - 1];
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getPermutation(3, 3));

    }
}
