package Find_Middle_Index;

public class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 3, -1, 8, 4};
        System.out.println(sol.findMiddleIndex(nums1)); // 3

        int[] nums2 = {1, -1, 4};
        System.out.println(sol.findMiddleIndex(nums2)); // 2

        int[] nums3 = {2, 5};
        System.out.println(sol.findMiddleIndex(nums3)); // -1
    }
}