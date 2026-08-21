package largest_number_179;

import java.util.Arrays;

public class largestNumber {
    public static String largestNumber(int[] nums) {
        String[] arr = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0"))
            return "0";

        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println("Largest Number: " + largestNumber(new int[] { 3, 30, 34, 5, 9 }));
    }
}
