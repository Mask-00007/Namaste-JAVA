package sum_ofeach_row_2dArray;

import java.util.ArrayList;
import java.util.List;

public class sumOfEachRow {
    public static List<Integer> rowSum(int[][] arr) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int row = 0; row < m; row++) {
            int sum = 0;
            for (int column = 0; column < n; column++) {
                int value = arr[row][column];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(sumOfEachRow.rowSum(arr));
    }

}
