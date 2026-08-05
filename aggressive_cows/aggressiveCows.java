package aggressive_cows;

import java.util.Arrays;

public class aggressiveCows {
    static boolean isValidAnswer(int[] stalls, int mid, int k) {
        int cowCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - stalls[lastPosition] >= mid) {
                cowCount++;
                lastPosition = i;

                if (cowCount == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static int agrressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int ans = -1;
        int n = stalls.length;
        int s = 0;
        int e = stalls[n - 1] - stalls[0];

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(stalls, mid, k)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = { 1, 2, 8, 4, 9 };
        int k = 3;

        System.out.println("Largest minimum distance: " + agrressiveCows(stalls, k));
    }

}
