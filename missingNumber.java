public class missingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xorSum = 0;
        // XOR WITH ALL ARRAY ELEMENTS
        for (int num : nums) {
            xorSum = xorSum ^ num;
        }

        // XOR WITH ALL THE ELEMENTS IN THE RANGE
        for (int i = 0; i <= nums.length; i++) {
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 0, 3, 4 };
        System.out.println("Missing number: " + missingNumber(nums));
    }
}
