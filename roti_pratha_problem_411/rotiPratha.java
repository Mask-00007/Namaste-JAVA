package roti_pratha_problem_411;

public class rotiPratha {
    static boolean isValidAns(int p, int[] cook, int n, int mid) {
        int parathaCount = 0;

        for (int i = 0; i < cook.length; i++) {
            int currentCookRank = cook[i];
            int timeTaken = 0;
            int j = 1;

            while (timeTaken <= mid) {
                if (timeTaken + j * currentCookRank <= mid) {
                    timeTaken += j * currentCookRank;
                    parathaCount++;
                    j++;
                } else {
                    break;
                }
            }

            if (parathaCount >= p) {
                return true;
            }
        }

        if (parathaCount >= p) {
            return true;
        } else {
            return false;
        }

    }

    static int minTimeToCookPratas(int p, int[] cook, int n) {
        int maxRank = -1;
        int ans = -1;

        for (int i = 0; i < cook.length; i++) {
            if (cook[i] > maxRank) {
                maxRank = cook[i];
            }
        }

        int s = 0;
        int e = maxRank;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(p, cook, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int p = 10;
        int[] cook = { 1, 2, 3, 4 };
        int n = cook.length;

        System.out.println(rotiPratha.minTimeToCookPratas(p, cook, n));
    }
}
