package total_noOf_occurrence;

public class totalOccurrence {
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

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

    static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 20, 20, 20, 30, 40, 50 };
        int target = 20;

        int lBIndex = getLowerBound(arr, target);
        int uBIndex = getUpperBound(arr, target);

        int totalNoOFOccurrences = uBIndex - lBIndex;

        System.out.println("No.of Occurrence: " + totalNoOFOccurrences);
    }

}
