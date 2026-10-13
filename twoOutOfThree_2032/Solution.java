package twoOutOfThree_2032;

import java.util.*;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int n : nums1)
            set1.add(n);
        for (int n : nums2)
            set2.add(n);
        for (int n : nums3)
            set3.add(n);

        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : set1)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        for (int n : set2)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        for (int n : set3)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        List<Integer> result = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) >= 2)
                result.add(key);
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = { 1, 1, 3, 2 };
        int[] nums2 = { 2, 3 };
        int[] nums3 = { 3 };

        System.out.println("Result: " + sol.twoOutOfThree(nums1, nums2, nums3));
    }
}
