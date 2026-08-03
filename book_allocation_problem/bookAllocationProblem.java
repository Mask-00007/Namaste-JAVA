package book_allocation_problem;

public class bookAllocationProblem {
    static boolean isValidAnswer(int[] arr, int mid, int k) {
        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } else {
                studentCount++;
                if (studentCount > k || arr[i] > mid) {
                    return false;
                } else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;

    }

    static int findPages(int[] arr, int k) {
        int n = arr.length;
        int s = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, mid, k)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 2;
        System.out.println("Minimum pages will be: " + findPages(arr, k));
    }

}
