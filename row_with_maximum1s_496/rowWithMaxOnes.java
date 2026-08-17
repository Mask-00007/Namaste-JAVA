package row_with_maximum1s_496;

public class rowWithMaxOnes {
    static int getFirstOccIndex(int[][] arr, int rowIndex) {
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int ans = totalCol;
        int target = -1;

        if (arr[rowIndex][totalCol - 1] == 0) {
            return totalCol;
        } else {
            int s = 0;
            int e = totalCol - 1;

            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
            return ans;
        }
    }

    static int rowWithMaxiOnes(int[][] mat) {
        int maxi = -1;
        int maxOneWaliRow = -1;
        int totalRow = mat.length;
        int totalCol = mat[0].length;

        for (int row = 0; row < totalRow; row++) {
            int firstOccIndex = getFirstOccIndex(mat, row);
            int oneCunt = totalCol - firstOccIndex;

            if (oneCunt != 0 && oneCunt > maxi) {
                maxi = oneCunt;
                maxOneWaliRow = row;
            }
        }
        return maxOneWaliRow;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };

        System.out.println("Row with max 1s: " + rowWithMaxiOnes(matrix));
    }
}
