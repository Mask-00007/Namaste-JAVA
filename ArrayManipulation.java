import java.util.HashMap;

public class ArrayManipulation {

    // 01 Reverse an array
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // 02 Shift an array element by one position
    static void shiftBy1(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    // 03 Print an extreme element in alternate manner
    static void printAlternate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
        System.out.println();
    }

    // 04 Find the mode of the array
    static int getMode(int[] arr1) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // for (int i : freq.keySet()) {
        // System.out.println(i + " -> " + freq.get(i));
        // }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if (currentKeyKiFrequency > maxFreq) {
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        return maxFreqWaliKey;
    }

    // 05 Find the maximum and minimum frequency of a key
    static int[] getHighestLowestFreqElement(int[] arr3) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr3) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        return new int[] { highestNum, lowestNum };
    }

    public static void main(String[] args) {
        // 01
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        for (int elements : arr) {
            System.out.println(elements + " ");
        }

        System.out.println("----------------------------------------");

        // 02
        shiftBy1(arr);
        for (int elements : arr) {
            System.out.println(elements + " ");
        }

        System.out.println("----------------------------------------");

        // 03
        printAlternate(arr);

        System.out.println("----------------------------------------");

        // 04
        int[] arr1 = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 };
        getMode(arr1);
        System.out.println(getMode(arr1));

        System.out.println("----------------------------------------");

        int[] arr3 = { 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5 };
        int[] result = getHighestLowestFreqElement(arr3);
        System.out.println("Highest frequency element: " + result[0]);
        System.out.println("Lowest frequency element: " + result[1]);

    }

}
