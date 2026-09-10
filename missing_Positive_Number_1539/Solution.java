package missing_Positive_Number_1539;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l + k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(sol.findKthPositive(arr, k));
    }
}
