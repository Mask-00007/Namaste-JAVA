package maximum_subArray_053;

public class maximumSubarray {
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, -1, 7, 8 };
        System.out.println("Output will be: " + maxSubArray(nums));
    }

}
