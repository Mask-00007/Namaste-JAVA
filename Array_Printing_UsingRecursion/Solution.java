package Array_Printing_UsingRecursion;

public class Solution {
    static void printArray(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }

        System.out.println(arr[i]);

        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 100, 1000, 10000, 100000 };
        int i = 0;

        printArray(arr, i);
    }

}
