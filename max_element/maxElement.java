package max_element;

public class maxElement {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 5 };
        System.out.println("Maximum element: " + findMax(arr));
    }

}
