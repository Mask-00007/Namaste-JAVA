package search_Insert_Position_35;

public class searchInsert {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int target = 35;

        System.out.println("Insert position: " + searchInsert(nums, target));
    }
}
