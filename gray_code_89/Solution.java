package gray_code_89;

import java.util.*;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int total = 1 << n; // 2^n numbers
        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1)); // Gray code formula
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        List<Integer> grayCodes = sol.grayCode(n);
        System.out.println("Gray code sequence for n = " + n + ":");
        System.out.println(grayCodes);
    }
}
