package transpose_matrix_867;

public class transposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        int originalRow = matrix.length;
        int originalCol = matrix[0].length;

        int newRow = originalCol;
        int newCol = originalRow;

        int ans[][] = new int[newRow][newCol];

        for (int i = 0; i < originalRow; i++) {
            for (int j = 0; j < originalCol; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] transposed = transpose(matrix);

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

}
