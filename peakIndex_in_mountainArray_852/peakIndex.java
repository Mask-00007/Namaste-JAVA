package peakIndex_in_mountainArray_852;

public class peakIndex {
    // * NORMAL METHOD
    // static int peakIndexMountainArray(int[] arr) {
    // int n = arr.length;
    // int s = 0;
    // int e = n - 1;
    // int ans = -1;

    // while (s < e) {
    // int mid = s + (e - s) / 2;
    // if (arr[mid] < arr[mid + 1]) {
    // s = mid + 1;
    // } else {
    // ans = mid;
    // e = mid - 1;
    // }
    // }
    // return ans;

    // * OPTIMIZED SOLUTION
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                // arr[mid] >= arr[mid + 1]
                e = mid;
            }
        }
        return s;

    }

    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40, 50, 45, 35 };
        int[] arr = { 1, 3, 5, 4, 2 };
        System.out.println("Peak Index will be: " + peakIndexInMountainArray(arr));
    }

}
