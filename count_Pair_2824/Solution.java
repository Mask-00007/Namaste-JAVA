package count_Pair_2824;

import java.util.Arrays;

public class Solution {
    public int countPairs(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { -1, 1, 2, 3, 1 };
        int target = 2;
        System.out.println(sol.countPairs(nums, target));
    }
}
