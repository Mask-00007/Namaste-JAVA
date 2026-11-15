package Search_2D_Matrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols - 1;

        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[][] matrix = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };

        System.out.println(obj.searchMatrix(matrix, 5)); // true
        System.out.println(obj.searchMatrix(matrix, 20)); // false
    }
}