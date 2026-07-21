package first_repeating_element;

import java.util.HashMap;

public class firstRepeatingElement {
    public static int findFirstRepeatingElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i : nums) {
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 5 };
        System.out.println("Output: " + findFirstRepeatingElement(nums));
    }

}
