package Make_Array_Elements_Equal_To_Zero;

public class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (nums[i] == 0) {
                int diff = Math.abs(leftSum - rightSum);

                if (diff == 0) {
                    ans += 2;
                } else if (diff == 1) {
                    ans += 1;
                }
            }

            leftSum += nums[i];
        }

        return ans;
    }
}