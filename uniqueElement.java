public class uniqueElement {
    static int findUniqueElement(int[] nums) {
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 3, 4, 5 };
        System.out.println("Unique element: " + findUniqueElement(nums));
    }
}
