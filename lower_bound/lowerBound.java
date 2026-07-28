package lower_bound;

// Time Complexity -> O(logn)

public class lowerBound {
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 30, 30, 40, 50 };
        int target = 30;

        System.out.println(getLowerBound(arr, target));
    }

}
