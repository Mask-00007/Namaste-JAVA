package findElement_inNearly_sortedArray_452;

public class elementInNearlySortedArray {
    static int findElementInNearlySortedArray(int[] arr, int k) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((mid - 1) >= 0 && arr[mid - 1] == k) {
                return mid - 1;
            }

            if (arr[mid] == k) {
                return mid;
            }

            if ((mid + 1) < n && arr[mid + 1] == k) {
                return mid + 1;
            }

            if (k > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int k = 20;
        int[] arr = { 5, 10, 30, 20, 40 };

        System.out.println("Output will be: " + findElementInNearlySortedArray(arr, k));
    }

}
