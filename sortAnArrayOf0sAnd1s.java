import java.util.Arrays;

public class sortAnArrayOf0sAnd1s {

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 1, 0, 0, 1 };
        System.out.println("Sorted Arrays: " + Arrays.toString(sortArray(nums)));
    }
}