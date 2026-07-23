package rotate_image_048;

public class rotateImage {
    public static void rotateClockWise(int[][] matrix, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int row = 0; row < N; row++) {
            int startCol = 0;
            int endCol = N - 1;
            while (startCol < endCol) {
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rotateClockWise(matrix, matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
