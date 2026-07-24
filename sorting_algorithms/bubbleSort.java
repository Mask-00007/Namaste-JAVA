package sorting_algorithms;

// BUBBLE SORT ALGORITHM -> TIME COMPLEXITY : O(n^2)
public class bubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 1, 4 };
        bubbleSort(arr);
        System.out.println("Printing the array: ");
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }

}
