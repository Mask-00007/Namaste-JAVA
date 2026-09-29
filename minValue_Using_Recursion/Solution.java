package minValue_Using_Recursion;

public class Solution {
    static void findMax(int[] arr, int i, int mini) {
        if (i >= arr.length) {
            System.out.println("max value: " + mini);
            return;
        }

        if (arr[i] < mini) {
            mini = arr[i];
        }

        findMax(arr, i + 1, mini);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int i = 0;
        int mini = Integer.MAX_VALUE;
        findMax(arr, i, mini);
    }
}
