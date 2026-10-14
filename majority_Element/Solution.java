package majority_Element;

public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int x : nums) {
            if (count == 0)
                candidate = x;
            count += (x == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(sol.majorityElement(nums)); // Expected: 2
    }
}
