package missing_elements_withDuplicates;

import java.util.ArrayList;
import java.util.List;

public class missingElementsWithDuplicates {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);
            int position = value - 1;

            if (position < n && nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 6 };
        System.out.println("Missing values are: " + findDisappearedNumbers(nums));
    }

}
