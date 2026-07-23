package wave_print_matrix;

import java.util.ArrayList;
import java.util.List;

public class printWaveMatrix {
    public static List<Integer> waveMatrix(int[][] matrix, int m, int n) {
        List<Integer> result = new ArrayList<>();

        for (int col = 0; col < n; col++) {
            if ((col & 1) == 1) {
                for (int row = m - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            } else {
                for (int row = 0; row < m; row++) {
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(printWaveMatrix.waveMatrix(matrix, matrix.length, matrix[0].length));

    }

}
