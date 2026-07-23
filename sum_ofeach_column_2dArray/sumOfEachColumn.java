package sum_ofeach_column_2dArray;

import java.util.ArrayList;
import java.util.List;

public class sumOfEachColumn {
    public static List<Integer> rowSum(int[][] arr) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int column = 0; column < n; column++) {
            int sum = 0;
            for (int row = 0; row < m; row++) {
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

        System.out.println(sumOfEachColumn.rowSum(arr));
    }

}
