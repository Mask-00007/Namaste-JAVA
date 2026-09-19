package Target_Indices_2089;

import java.util.*;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessCount = 0, equalCount = 0;
        for (int num : nums) {
            if (num < target)
                lessCount++;
            else if (num == target)
                equalCount++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < equalCount; i++) {
            result.add(lessCount + i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        System.out.println(sol.targetIndices(nums, target));
    }
}
