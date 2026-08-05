package painter_partition_problem;

public class painterPartitionProblem {
    public static boolean isValidSolution(int[] boards, int mid, int k) {
        int painterCount = 1;
        int paintedLength = 0;

        for (int i = 0; i < boards.length; i++) {
            if (paintedLength + boards[i] <= mid) {
                paintedLength += boards[i];
            } else {
                painterCount++;
                paintedLength = boards[i];
                if (painterCount > k || boards[i] > mid) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int minTime(int[] boards, int k) {
        int sum = 0;
        int ans = -1;

        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
        }

        int s = 0;
        int e = sum;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidSolution(boards, mid, k)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] boards = { 10, 20, 30, 40 };
        int k = 2;

        int result = minTime(boards, k);
        System.out.println("Minimum time required: " + result);
    }

}