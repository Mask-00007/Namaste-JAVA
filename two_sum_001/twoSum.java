package two_sum_001;

import java.util.Arrays;

public class twoSum {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] ans = { i, j };
                    return ans;
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3, -4, -5 };
        int target = -8;
        System.out.println("Required indexes: " + Arrays.toString(twoSum(nums, target)));
    }
}
