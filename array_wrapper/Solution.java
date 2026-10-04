package array_wrapper;

import java.util.Arrays;

public class Solution {
    private int[] nums;

    // Constructor
    public Solution(int[] nums) {
        this.nums = nums;
    }

    // Addition: sum of elements in both arrays
    public int add(Solution other) {
        return Arrays.stream(this.nums).sum() + Arrays.stream(other.nums).sum();
    }

    // String conversion
    @Override
    public String toString() {
        return Arrays.toString(nums);
    }

    // Example usage
    public static void main(String[] args) {
        Solution obj1 = new Solution(new int[] { 1, 2 });
        Solution obj2 = new Solution(new int[] { 3, 4 });

        System.out.println(obj1.add(obj2)); // Output: 10
        System.out.println(obj1.toString()); // Output: [1, 2]
    }
}
