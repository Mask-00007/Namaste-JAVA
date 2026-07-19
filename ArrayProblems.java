public class ArrayProblems {

    // 01 Average of array elements
    static double getAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = (double) sum / size;
        return avg;
    }

    // 02 Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;

    }

    // 03 Search for an element in an Array{Linear Search}
    static boolean findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // 04 Maximun element in an array
    static int getMaximun(int[] arr) {
        int maxi = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] > maxi) {
            // maxi = arr[i];
            // }
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    // 05 Return Sum of +ve and -ve numbers
    static int[] getPositiveNegativeSum(int[] arr1) {
        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                posSum += arr1[i];
            } else {
                negSum += arr1[i];
            }
        }

        int result[] = { posSum, negSum };
        return result;

    }

    // 06 Count the numbers of Zeroes and Ones
    static int[] getNumberOfZeroesAndOnes(int[] arr2) {
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 1) {
                oneCount++;
            } else {
                zeroCount++;
            }
        }

        int[] count = { oneCount, zeroCount };
        return count;
    }

    // 07 Find first Unsorted elements in array
    static int getUnsortedArray(int[] customArray) {
        for (int i = 0; i < customArray.length; i++) {
            if (customArray[i + 1] <= customArray[i]) {
                return customArray[i + 1];
            }
        }
        return -1;
    }

    // 08 Swap alternate elements in an Array
    static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        // 01
        int[] arr = { 2, 4, 3, 3 };
        System.out.println(getAverage(arr));

        // 02
        int ans[] = multiplyBy10(arr);
        System.out.println("Printing ans array: ");
        for (int i : ans) {
            System.out.println(i);
        }

        // 03
        boolean output = findTarget(arr, 9);
        System.out.println(output);

        // 04
        System.out.println(getMaximun(arr));

        // 05
        int[] arr1 = { 2, 4, 5, -9, 5, -3 };
        int[] result = getPositiveNegativeSum(arr1);
        System.out.println("POSITIVE SUM WILL BE: " + result[0]);
        System.out.println("NEGATIVE SUM WILL BE: " + result[1]);

        // 06
        int[] arr2 = { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1 };
        int[] count = getNumberOfZeroesAndOnes(arr2);
        System.out.println("NUMBER OF ONES WILL BE: " + count[0]);
        System.out.println("NUMBER OF ZEROES WILL BE: " + count[1]);

        // 07
        int[] customArray = { 1, 3, 6, 4, 8 };
        System.out.println(getUnsortedArray(customArray));

        // 08
        swapAlternate(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

}
