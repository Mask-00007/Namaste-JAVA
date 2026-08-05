package EKO_SPOJ;

public class solution {
    static boolean isValidAns(int[] trees, int mid, int m) {
        int woodCollected = 0;

        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                int currentWoodCollected = trees[i] - mid;
                woodCollected += currentWoodCollected;
            }
        }

        if (woodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    static int maxSawHeight(int[] trees, int m) {
        int ans = -1;
        int maxi = -1;
        int s = 0;

        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }

        int e = maxi;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(trees, mid, m)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] trees = { 20, 15, 10, 17 };
        int m = 7;

        int result = maxSawHeight(trees, m);
        System.out.println("Maximum saw height: " + result);
    }

}
