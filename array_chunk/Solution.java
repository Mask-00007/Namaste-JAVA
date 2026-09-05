package array_chunk;

import java.util.*;

class Solution {
    public static List<List<Integer>> chunk(int[] arr, int size) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += size) {
            List<Integer> chunk = new ArrayList<>();
            for (int j = i; j < i + size && j < arr.length; j++) {
                chunk.add(arr[j]);
            }
            result.add(chunk);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int size = 2;

        List<List<Integer>> chunks = chunk(arr, size);
        System.out.println(chunks);
    }
}
