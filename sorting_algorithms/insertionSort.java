package sorting_algorithms;

// INSERTION SORT -> TIME COMPLEXITY : O(n^2)

public class insertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            int currValue = arr[i];

            while (prev >= 0 && currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currValue;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 1, 4 };
        insertionSort(arr);
        System.out.println("Printing the array: ");
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }

}
