package binary_search_704;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int target = 30;
        System.out.println("Required index will be: " + search(nums, target));
    }

}
