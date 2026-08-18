package duplicate_zeroes_1069;

import java.util.Arrays;

public class duplicateZeroes {

    public static void duplicateZeros(int[] arr) {
        int zeros = 0;
        int n = arr.length;

        // Count zeros
        for (int num : arr) {
            if (num == 0)
                zeros++;
        }

        // Traverse backwards
        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
