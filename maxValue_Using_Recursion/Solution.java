package maxValue_Using_Recursion;

public class Solution {
    static void findMax(int[] arr, int i, int maxi) {
        if (i >= arr.length) {
            System.out.println("max value: " + maxi);
            return;
        }

        if (arr[i] > maxi) {
            maxi = arr[i];
        }

        findMax(arr, i + 1, maxi);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int i = 0;
        int maxi = Integer.MIN_VALUE;
        findMax(arr, i, maxi);
    }

}
