package remove_duplicate_026;

import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
    static int removeDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        System.out.println("Output: " + removeDuplicate(nums));
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(nums, removeDuplicate(nums))));
    }
}
